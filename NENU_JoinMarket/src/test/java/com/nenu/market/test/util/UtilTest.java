package com.nenu.market.test.util;

import com.nenu.market.entity.city.City;
import com.nenu.market.entity.totalvisit.TotalVisit;
import com.nenu.market.service.city.CityService;
import com.nenu.market.service.totalvisit.TotalVisitService;
import com.nenu.market.util.ProcessData;
import com.nenu.market.util.ReadExcel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.Map;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 9:37 2019/5/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilTest {

    @Autowired
    CityService cityService;

    @Autowired
    TotalVisitService totalVisitService;

    @Test
    public void testListAllCity() throws Exception {
        System.out.println(cityService.listAllCity());
    }

    @Test
    public void testUpdateCitySign() throws Exception{
        City city = new City();
        city.setCity_sign("88");
        city.setCity_name("洛阳");
        System.out.println(cityService.updateCitySign(city));
    }

    @Test
    public void testUpdateCityExpect() throws Exception{
        City city = new City();
        city.setCity_exceptation("66");
        city.setCity_name("洛阳");
        System.out.println(cityService.updateCityExpect(city));
    }

    @Test
    public void testSelectByCityName() throws Exception{
        System.out.println(cityService.selectByCityName("洛阳"));
    }

    @Test
    public void testAddCity() throws Exception {
        String cityName = "测试市";
        City city = new City();
        city.setCity_name(cityName);
        city.setYear(2019);
        city.setCity_exceptation("111");
        city.setCity_sign("222");
        city.setCity_studentFrom("333");
        city.setEducation_yon(1);
        System.out.println(cityService.addCity(city));
    }

    @Test
    public void testQueryCitySignByYear() throws Exception{
        int year = 2019;
        int fifthYearCitySign = Integer.parseInt(cityService.queryCitySignByYear(year, "长春市").getCity_sign());
        int fourthYearCitySign = Integer.parseInt(cityService.queryCitySignByYear(year - 1, "长春市").getCity_sign());
        int thirdYearCitySign = Integer.parseInt(cityService.queryCitySignByYear(year - 2, "长春市").getCity_sign());
        int secondYearCitySign = Integer.parseInt(cityService.queryCitySignByYear(year - 3, "长春市").getCity_sign());
        int firstYearCitySign = Integer.parseInt(cityService.queryCitySignByYear(year - 4, "长春市").getCity_sign());
        int fiveYearsCitySign = fifthYearCitySign + fourthYearCitySign + thirdYearCitySign + secondYearCitySign + firstYearCitySign;
        System.out.println(fiveYearsCitySign);
    }

//    @Test
//    public void testProcessDataStudent() throws Exception{
//        ReadExcel readExcel = new ReadExcel();
//        File StudentFile = new File("target/classes/student.xlsx");
//        String strExcel = readExcel.PoiTest(StudentFile);
//
//        ProcessData processData = new ProcessData();
//
//        Map<String,Integer> signCityMap = processData.signCity(strExcel);
//        for (Map.Entry<String, Integer> entry :signCityMap.entrySet()) {
//            String cityName = entry.getKey();
//            String signCity = entry.getValue().toString();
//            City city = new City();
//            city.setCity_name(cityName);
//            city.setYear(2019);
//            city.setCity_exceptation("0");
//            city.setCity_sign(signCity);
//            city.setCity_studentFrom("0");
//            city.setEducation_yon(1);
//            if(cityService.selectByCityName(cityName) != null) {
//                System.out.println(cityService.updateCitySign(city));
//            }else{
//                System.out.println(cityService.addCity(city));
//            }
//        }
//
//        Map<String,Integer> expectCityMap = processData.expectCity(strExcel);
//        for (Map.Entry<String, Integer> entry :expectCityMap.entrySet()) {
//            String cityName = entry.getKey();
//            String expectCity = entry.getValue().toString();
//            City city = new City();
//            city.setCity_name(cityName);
//            city.setYear(2019);
//            city.setCity_exceptation(expectCity);
//            city.setCity_sign("0");
//            city.setCity_studentFrom("0");
//            city.setEducation_yon(0);
//            if(cityService.selectByCityName(cityName) != null) {
//                System.out.println(cityService.updateCityExpect(city));
//            }else{
//                System.out.println(cityService.addCity(city));
//            }
//        }
//
//        Map<String,Integer> studentFromCityMap = processData.studentFromCity(strExcel);
//        for (Map.Entry<String, Integer> entry :studentFromCityMap.entrySet()) {
//            String cityName = entry.getKey();
//            String studentFromCity = entry.getValue().toString();
//            City city = new City();
//            city.setCity_name(cityName);
//            city.setYear(2019);
//            city.setCity_exceptation("0");
//            city.setCity_sign("0");
//            city.setCity_studentFrom(studentFromCity);
//            city.setEducation_yon(1);
//            if(cityService.selectByCityName(cityName) != null) {
//                System.out.println(cityService.updateCityStudentFrom(city));
//            }else{
//                System.out.println(cityService.addCity(city));
//            }
//        }
//    }
//
//    @Test
//    public void testProcessDataVisitCompany() throws Exception{
//        ReadExcel readExcel = new ReadExcel();
//        File visitCountFile = new File("target/classes/visitCompany.xlsx");
//        String visitCountExcel = readExcel.PoiTest(visitCountFile);
//
//        ProcessData processData = new ProcessData();
//
//        Map<String,Integer> visitCountMap = processData.visitCompany(visitCountExcel);
//        for (Map.Entry<String, Integer> entry :visitCountMap.entrySet()) {
//            String cityName = entry.getKey();
//            int visitCount = entry.getValue();
//            TotalVisit totalVisit = new TotalVisit();
//            totalVisit.setCity_name(cityName);
//            totalVisit.setYear(2019);
//            totalVisit.setVisitCount(visitCount);
//            totalVisit.setReturnCount(0);
//            totalVisit.setEducation_yon(1);
//            if(totalVisitService.selectByCityName(cityName) != null) {
//                totalVisitService.updateCityVisitCount(totalVisit);
//            }else{
//                totalVisitService.addTotalVisit(totalVisit);
//            }
//        }
//    }
//
//    @Test
//    public void testProcessDataReturnCompany() throws Exception{
//        ReadExcel readExcel = new ReadExcel();
//        File returnCountFile = new File("target/classes/companyBack.xlsx");
//        String returnCountExcel = readExcel.PoiTest(returnCountFile);
//
//        ProcessData processData = new ProcessData();
//
//        Map<String,Integer> returnCountMap = processData.returnCompany(returnCountExcel);
//        for (Map.Entry<String, Integer> entry :returnCountMap.entrySet()) {
//            String cityName = entry.getKey();
//            int returnCount = entry.getValue();
//            TotalVisit totalVisit = new TotalVisit();
//            totalVisit.setCity_name(cityName);
//            totalVisit.setYear(2019);
//            totalVisit.setVisitCount(0);
//            totalVisit.setReturnCount(returnCount);
//            totalVisit.setEducation_yon(0);
//            if(totalVisitService.selectByCityName(cityName) != null) {
//                System.out.println(totalVisitService.updateCityVisitCount(totalVisit));
//            }else{
//                System.out.println(totalVisitService.addTotalVisit(totalVisit));
//            }
//        }
//    }
}
