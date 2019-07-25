package com.nenu.market.test.util;

import com.nenu.market.entity.city.City;
import com.nenu.market.entity.totalvisit.TotalVisit;
import com.nenu.market.service.city.CityService;
import com.nenu.market.service.totalvisit.TotalVisitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        city.setCity_sign(88);
        city.setCity_name("洛阳");
        System.out.println(cityService.updateCitySign(city));
    }

    @Test
    public void testUpdateCityExpect() throws Exception{
        City city = new City();
        city.setCity_exceptation(66);
        city.setCity_name("洛阳");
        System.out.println(cityService.updateCityExpect(city));
    }

    @Test
    public void testSelectByCityNameAndYear() throws Exception{
        City city = new City();
        city.setYear(2019);
        city.setCity_name("长春市");
        System.out.println(cityService.selectByCityNameAndYear(city));
    }

    @Test
    public void testAddCity() throws Exception {
        String cityName = "测试市";
        City city = new City();
        city.setCity_name(cityName);
        city.setYear(2019);
        city.setCity_exceptation(111);
        city.setCity_sign(222);
        city.setCity_studentFrom(333);
        city.setEducation_yon(1);
        System.out.println(cityService.addCity(city));
    }

    @Test
    public void testQueryCitySignByYear() throws Exception{
        int year = 2019;
        String cityName = "哈尔滨市";

        City city = new City();
        city.setYear(year);
        city.setCity_name(cityName);

        int fifthYearCitySign;
        int fourthYearCitySign;
        int thirdYearCitySign;
        int secondYearCitySign;
        int firstYearCitySign;

        if(cityService.selectByCityNameAndYear(city) != null){
            fifthYearCitySign = cityService.queryCitySignByYear(year, cityName).getCity_sign();
        }else{
            fifthYearCitySign = 0;
        }

        city.setYear(year - 1);
        if(cityService.selectByCityNameAndYear(city) != null){
            fourthYearCitySign = cityService.queryCitySignByYear(year - 1, cityName).getCity_sign();
        }else{
            fourthYearCitySign = 0;
        }

        city.setYear(year - 2);
        if(cityService.selectByCityNameAndYear(city) != null){
            thirdYearCitySign = cityService.queryCitySignByYear(year - 2, cityName).getCity_sign();
        }else{
            thirdYearCitySign = 0;
        }

        city.setYear(year - 3);
        if(cityService.selectByCityNameAndYear(city) != null){
            secondYearCitySign = cityService.queryCitySignByYear(year - 3, cityName).getCity_sign();
        }else{
            secondYearCitySign = 0;
        }

        city.setYear(year - 4);
        if(cityService.selectByCityNameAndYear(city) != null){
            firstYearCitySign = cityService.queryCitySignByYear(year - 4, cityName).getCity_sign();
        }else{
            firstYearCitySign = 0;
        }

        int fiveYearsCitySign = fifthYearCitySign + fourthYearCitySign + thirdYearCitySign + secondYearCitySign + firstYearCitySign;

        TotalVisit totalVisit = new TotalVisit();
        totalVisit.setCity_name(cityName);
        totalVisit.setYear(year);
        totalVisit.setSignNumber_b(fiveYearsCitySign);

        if(totalVisitService.selectByCityName(cityName) != null){
            System.out.println(totalVisitService.updateSignNumber_b(totalVisit));
        }else {
            System.out.println(totalVisitService.addTotalVisit(totalVisit));
        }
    }

}
