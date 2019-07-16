package com.nenu.market.controller.processdata;

import com.nenu.market.entity.city.City;
import com.nenu.market.entity.totalvisit.TotalVisit;
import com.nenu.market.service.city.CityService;
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
        int isEducation = 0;
        int excelType = 1;

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

                ProcessData processData = new ProcessData();

                Map<String,Integer> signCityMap = processData.signCity(strExcel);
                for (Map.Entry<String, Integer> entry :signCityMap.entrySet()) {
                    String cityName = entry.getKey();
                    String signCity = entry.getValue().toString();
                    City city = new City();
                    city.setCity_name(cityName);
                    city.setYear(year);
                    city.setCity_exceptation("0");
                    city.setCity_sign(signCity);
                    city.setCity_studentFrom("0");
                    city.setEducation_yon(isEducation);
                    if(cityService.selectByCityName(cityName) != null) {
                        cityService.updateCitySign(city);
                    }else{
                        cityService.addCity(city);
                    }
                }

                Map<String,Integer> expectCityMap = processData.expectCity(strExcel);
                for (Map.Entry<String, Integer> entry :expectCityMap.entrySet()) {
                    String cityName = entry.getKey();
                    String expectCity = entry.getValue().toString();
                    City city = new City();
                    city.setCity_name(cityName);
                    city.setYear(year);
                    city.setCity_exceptation(expectCity);
                    city.setCity_sign("0");
                    city.setCity_studentFrom("0");
                    city.setEducation_yon(isEducation);
                    if(cityService.selectByCityName(cityName) != null) {
                        cityService.updateCityExpect(city);
                    }else{
                        cityService.addCity(city);
                    }
                }

                Map<String,Integer> studentFromCityMap = processData.studentFromCity(strExcel);
                for (Map.Entry<String, Integer> entry :studentFromCityMap.entrySet()) {
                    String cityName = entry.getKey();
                    String studentFromCity = entry.getValue().toString();
                    City city = new City();
                    city.setCity_name(cityName);
                    city.setYear(year);
                    city.setCity_exceptation("0");
                    city.setCity_sign("0");
                    city.setCity_studentFrom(studentFromCity);
                    city.setEducation_yon(isEducation);
                    if(cityService.selectByCityName(cityName) != null) {
                        cityService.updateCityStudentFrom(city);
                    }else{
                        cityService.addCity(city);
                    }
                }
            }else if(excelType == 2){
                //保存文件
                file.transferTo(dest);
                ReadExcel readExcel = new ReadExcel();
                File visitCountFile = new File("target/classes/visitCompany.xlsx");
                String visitCountExcel = readExcel.PoiTest(visitCountFile);

                ProcessData processData = new ProcessData();

                Map<String,Integer> visitCountMap = processData.visitCompany(visitCountExcel);
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

                Map<String,Integer> returnCountMap = processData.returnCompany(returnCountExcel);
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
                        totalVisitService.updateCityVisitCount(totalVisit);
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
