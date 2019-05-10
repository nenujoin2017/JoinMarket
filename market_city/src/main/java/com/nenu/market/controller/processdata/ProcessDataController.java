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
import java.io.IOException;
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

    @RequestMapping("fileUploadStudent")
    @ResponseBody
    public String fileUploadStudent(@RequestParam("fileName") MultipartFile file) throws Exception{
        int year = 2019;
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        //上传之后文件置于的路径
        String path = "C:\\Users\\liangll\\Desktop\\nenuscfx\\target\\classes" ;
        File dest = new File(path + "/" + fileName);
        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
            ReadExcel readExcel = new ReadExcel();
            File StudentFile = new File("target/classes/student.xlsx");
            String strExcel = readExcel.PoiTest(StudentFile);

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
                if(cityService.selectByCityName(cityName) != null) {
                    System.out.println(cityService.updateCitySign(city));
                }else{
                    System.out.println(cityService.addCity(city));
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
                if(cityService.selectByCityName(cityName) != null) {
                    System.out.println(cityService.updateCityExpect(city));
                }else{
                    System.out.println(cityService.addCity(city));
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
                if(cityService.selectByCityName(cityName) != null) {
                    System.out.println(cityService.updateCityStudentFrom(city));
                }else{
                    System.out.println(cityService.addCity(city));
                }
            }
            return "successful";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }

    @RequestMapping("fileUploadCount")
    @ResponseBody
    public String fileUploadCount(@RequestParam("fileName") MultipartFile file) throws Exception{
        int year = 2019;
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        //上传之后文件置于的路径
        String path = "C:\\Users\\liangll\\Desktop\\nenuscfx\\target\\classes" ;
        File dest = new File(path + "/" + fileName);
        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
            ReadExcel readExcel = new ReadExcel();
            File visitCountFile = new File("target/classes/visitCompany.xlsx");
            File returnCountFile = new File("target/classes/companyBack.xlsx");
            String visitCountExcel = readExcel.PoiTest(visitCountFile);
            String returnCountExcel = readExcel.PoiTest(returnCountFile);

            ProcessData processData = new ProcessData();

            Map<String,Integer> visitCountMap = processData.CountCompany(visitCountExcel);
            for (Map.Entry<String, Integer> entry :visitCountMap.entrySet()) {
                String cityName = entry.getKey();
                int visitCount = entry.getValue();
                TotalVisit totalVisit = new TotalVisit();
                totalVisit.setCity_name(cityName);
                totalVisit.setYear(2019);
                totalVisit.setVisitCount(visitCount);
                totalVisit.setReturnCount(0);
                if(totalVisitService.selectByCityName(cityName) != null) {
                    System.out.println(totalVisitService.updateCityVisitCount(totalVisit));
                }else{
                    System.out.println(totalVisitService.addTotalVisit(totalVisit));
                }
            }

            Map<String,Integer> returnCountMap = processData.CountCompany(returnCountExcel);
            for (Map.Entry<String, Integer> entry :returnCountMap.entrySet()) {
                String cityName = entry.getKey();
                int returnCount = entry.getValue();
                TotalVisit totalVisit = new TotalVisit();
                totalVisit.setCity_name(cityName);
                totalVisit.setYear(2019);
                totalVisit.setVisitCount(0);
                totalVisit.setReturnCount(returnCount);
                if(totalVisitService.selectByCityName(cityName) != null) {
                    System.out.println(totalVisitService.updateCityReturnCount(totalVisit));
                }else{
                    System.out.println(totalVisitService.addTotalVisit(totalVisit));
                }
            }
            return "successful";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }
}
