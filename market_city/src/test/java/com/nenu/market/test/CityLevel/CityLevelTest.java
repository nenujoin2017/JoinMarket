package com.nenu.market.test.CityLevel;

import com.nenu.market.entity.CityLevel.CityLevel;
import com.nenu.market.service.CityLevel.CityLevelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityLevelTest {
    @Autowired
    CityLevelService cityLevelService;

    @Test
    public void testListAllCityLevel() throws Exception{
        System.out.println(cityLevelService.listAllCityLevel());
    }

    @Test
    public void testAddCityLevel() throws Exception{
        CityLevel cityLevel = new CityLevel();
        cityLevel.setCityName("北京市");
        cityLevel.setCityRank("一线");
        cityLevel.setCityGrading("110");
        cityLevel.setRoad("否");
        cityLevelService.addCityLevel(cityLevel);
        System.out.println(cityLevelService.listAllCityLevel());
    }

    @Test
    public void testDelCitiLevel() throws Exception{
        int id = 4;
        cityLevelService.deleteCityLevel(id);
        System.out.println(cityLevelService.listAllCityLevel());
    }

    @Test
    public void testUpdateCityLevel() throws Exception{
        CityLevel cityLevel=new CityLevel();
        cityLevel.setId(4);
        cityLevel.setCityName("打嗝");
        cityLevel.setCityRank("一线");
        cityLevel.setCityGrading("100");
        cityLevel.setRoad("是");
        cityLevelService.updateCityLevel(cityLevel);
        System.out.println(cityLevelService.listAllCityLevel());
    }

    @Test
    public  void testSearchById() throws Exception{
        System.out.println(cityLevelService.searchCityLevelById(3));
    }

    @Test
    public void testSearch() throws Exception{
        System.out.println(cityLevelService.searchCityLevel("长春市"));
    }
}
