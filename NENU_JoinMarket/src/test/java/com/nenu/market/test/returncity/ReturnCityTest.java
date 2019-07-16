package com.nenu.market.test.returncity;

import com.nenu.market.entity.returncity.ReturnCity;
import com.nenu.market.service.returncity.ReturnCityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReturnCityTest {

    @Autowired
    ReturnCityService returnCityService;

    @Test
    public void testList() throws Exception{
        System.out.println(returnCityService.listAllReturnCity());
    }

    @Test
    public void testSelect1() throws Exception{
        ReturnCity returnCity = new ReturnCity();
        returnCity.setEducation_yon(1);
        returnCity.setCity_year(2019);
        returnCity.setCity_name("广州市");
        System.out.println(returnCityService.SelectCity1(returnCity));
    }

    @Test
    public void testSelect2() throws Exception{
        ReturnCity returnCity = new ReturnCity();
        returnCity.setEducation_yon(1);
        returnCity.setCity_year(2019);
        System.out.println(returnCityService.SelectCity2(returnCity));
    }
}
