package com.nenu.market.controller.processdata;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.city.City;
import com.nenu.market.entity.student.Student;
import com.nenu.market.entity.totalvisit.TotalVisit;
import com.nenu.market.service.city.CityService;
import com.nenu.market.service.student.StudentService;
import com.nenu.market.service.totalvisit.TotalVisitService;
import com.nenu.market.util.ProcessData;
import com.nenu.market.util.ReadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 22:46 2019/5/9
 */

@Controller
@RequestMapping("/")
public class ProcessDataController {

    @Resource
    CityService cityService;

    @Resource
    StudentService studentService;

    @Autowired
    TotalVisitService totalVisitService;

    @RequestMapping("file")
    public String file(){
        return "/test";
    }

    @RequestMapping("fileUpload")
    @ResponseBody
//    public String fileUpload(@RequestParam("fileName") MultipartFile file, String yearStr, String isEducationStr, String excelTypeStr) throws Exception{
    public String fileUpload(@RequestParam("fileName") MultipartFile file) throws Exception{
//        int year = Integer.parseInt(yearStr);
//        int isEducation = Integer.parseInt(isEducationStr);
//        int excelType = Integer.parseInt(excelTypeStr);
        int year = 2019;
        String yearStr = "2019";

        int isEducation = 0;
        int excelType = 1;
        String educationStr = "本科生";

        String isEducationStr;
        if(isEducation == 0){
            isEducationStr = "非教育";
        }else{
            isEducationStr = "教育";
        }

        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        //上传之后文件置于的路径
        String URL = this.getClass().getClassLoader().getResource("").toString();
        URL = URL.replace("file:/","");
        System.out.println(URL);
        String path = URL;

        File dest = new File(path + "/" + fileName);
        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }

        try {
            if(excelType == 1){
                //保存文件
                file.transferTo(dest);
                ReadExcel readExcel = new ReadExcel();
                File studentFile = new File("target/classes/student.xlsx");
                String strExcel = readExcel.PoiTest(studentFile);

                System.out.println(strExcel);
                ProcessData processData = new ProcessData();

                //签约城市
                String sign = "签约城市";
                Map<String,Integer> signCityMap = processData.processCity(strExcel,sign);
                for (Map.Entry<String, Integer> entry :signCityMap.entrySet()) {
                    String cityName = entry.getKey();
//                    int _signCity = entry.getValue().toString();
                    City city = new City();
                    city.setCity_name(cityName);
                    city.setYear(year);
                    city.setCity_exceptation(0);
                    city.setCity_sign(entry.getValue());
                    city.setCity_studentFrom(0);
                    city.setEducation_yon(isEducation);
                    if(cityService.selectByCityName(cityName) != null) {
                        cityService.updateCitySign(city);
                    }else{
                        cityService.addCity(city);
                    }
                }

                //期望城市
                String expect = "期望城市";
                Map<String,Integer> expectCityMap = processData.processCity(strExcel, expect);
                for (Map.Entry<String, Integer> entry :expectCityMap.entrySet()) {
                    String cityName = entry.getKey();
//                    String expectCity = entry.getValue().toString();
                    City city = new City();
                    city.setCity_name(cityName);
                    city.setYear(year);
                    city.setCity_exceptation(entry.getValue());
                    city.setCity_sign(0);
                    city.setCity_studentFrom(0);
                    city.setEducation_yon(isEducation);
                    if(cityService.selectByCityName(cityName) != null) {
                        cityService.updateCityExpect(city);
                    }else{
                        cityService.addCity(city);
                    }
                }

                //生源城市
                String studentFrom = "生源城市";
                Map<String,Integer> studentFromCityMap = processData.processCity(strExcel,studentFrom);
                for (Map.Entry<String, Integer> entry :studentFromCityMap.entrySet()) {
                    String cityName = entry.getKey();
//                    String studentFromCity = entry.getValue().toString();
                    City city = new City();
                    city.setCity_name(cityName);
                    city.setYear(year);
                    city.setCity_exceptation(0);
                    city.setCity_sign(0);
                    city.setCity_studentFrom(entry.getValue());
                    city.setEducation_yon(isEducation);
                    if(cityService.selectByCityName(cityName) != null) {
                        cityService.updateCityStudentFrom(city);
                    }else{
                        cityService.addCity(city);
                    }
                }


                JSONArray array = JSONArray.parseArray(strExcel);
                for(int i = 0;i < array.size();i++){
                    JSONObject jsonObject = array.getJSONObject(i);
                    String studentNameStr = jsonObject.getString("学生姓名");
                    String studentFromStr = jsonObject.getString("生源城市");
                    String sexStr = jsonObject.getString("性别");
                    String nationStr = jsonObject.getString("民族");
                    String collegeStr = jsonObject.getString("学院");
                    String majorStr = jsonObject.getString("专业");
                    String positionStr = jsonObject.getString("职位");
                    String signCompanyStr = jsonObject.getString("签约单位");

                    Student student = new Student();
                    student.setStudentName(studentNameStr);
                    student.setSex(sexStr);
                    student.setNation(nationStr);
                    student.setEducation(educationStr);
                    student.setSignType(isEducationStr);
                    student.setCollege(collegeStr);
                    student.setMajor(majorStr);
                    student.setStudentFrom(studentFromStr);
                    student.setPosition(positionStr);
                    student.setStudent_year(yearStr);
                    student.setSignCompany(signCompanyStr);

                    studentService.addStudent(student);
                }

            }else if(excelType == 2){
                //保存文件
                file.transferTo(dest);
                ReadExcel readExcel = new ReadExcel();
                File visitCountFile = new File("target/classes/visitCompany.xlsx");
                String visitCountExcel = readExcel.PoiTest(visitCountFile);

                ProcessData processData = new ProcessData();

                //走访城市
                String visit = "走访城市";
                Map<String,Integer> visitCountMap = processData.processCity(visitCountExcel, visit);
                for (Map.Entry<String, Integer> entry :visitCountMap.entrySet()) {
                    String cityName = entry.getKey();
                    int visitCount = entry.getValue();
                    TotalVisit totalVisit = new TotalVisit();
                    totalVisit.setCity_name(cityName);
                    totalVisit.setYear(2019);
                    totalVisit.setVisitCount(visitCount);
                    totalVisit.setReturnCount(0);
                    totalVisit.setEducation_yon(isEducation);
                    if(totalVisitService.selectByCityName(cityName) != null) {
                        totalVisitService.updateCityVisitCount(totalVisit);
                    }else{
                        totalVisitService.addTotalVisit(totalVisit);
                    }
                }
            }else{
                //保存文件
                file.transferTo(dest);
                ReadExcel readExcel = new ReadExcel();
                File returnCountFile = new File("target/classes/companyBack.xlsx");
                String returnCountExcel = readExcel.PoiTest(returnCountFile);

                ProcessData processData = new ProcessData();

                //回访城市
                String comeback = "回访城市";
                Map<String,Integer> returnCountMap = processData.processCity(returnCountExcel,comeback);
                for (Map.Entry<String, Integer> entry :returnCountMap.entrySet()) {
                    String cityName = entry.getKey();
                    int returnCount = entry.getValue();
                    TotalVisit totalVisit = new TotalVisit();
                    totalVisit.setCity_name(cityName);
                    totalVisit.setYear(2019);
                    totalVisit.setVisitCount(0);
                    totalVisit.setReturnCount(returnCount);
                    totalVisit.setEducation_yon(isEducation);
                    if(totalVisitService.selectByCityName(cityName) != null) {
                        totalVisitService.updateCityReturnCount(totalVisit);
                    }else{
                        totalVisitService.addTotalVisit(totalVisit);
                    }
                }
            }
            return "successful";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }
}
