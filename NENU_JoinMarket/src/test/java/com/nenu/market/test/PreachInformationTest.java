package com.nenu.market.test;


import com.nenu.market.entity.PreachInformation;
import com.nenu.market.service.preachinformation.PreachInformationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 20:54 2019/7/18
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PreachInformationTest {
    @Autowired
    PreachInformationService preachInformationService;

    @Test
    public void contextLoads() {

    }
    @Test
    public void testListAll() throws Exception {

            System.out.println(preachInformationService.listAll());

    }
    @Test
    public void testAdd() throws Exception{
        PreachInformation preachInformation=new PreachInformation();
        preachInformation.setUnitName("西南大学");
        preachInformation.setYear("2012");
        preachInformation.setPresentationTime("2019.10.3");
        preachInformation.setAdvocate("赵琦君");
        preachInformation.setRecruitmentPosition("秘书员");
        preachInformation.setSigning("2");
        preachInformation.setPlace("净月信息发布厅");
        preachInformationService.addUser(preachInformation);
    }
    @Test
    public void search() throws Exception{
        System.out.println(preachInformationService.searchByTime("2019.10.1"));
    }

    @Test
    public void update() throws Exception{
        System.out.println(preachInformationService.updateAdvocate("zhao","2019.10.2"));
    }
    @Test
    public void update1() throws Exception{
        System.out.println(preachInformationService.updateRecruitmentPosition("秘书","2019.10.2"));
    }

    @Test
    public void update2() throws Exception{
        System.out.println(preachInformationService.updateSigning("10","2019.10.2"));
    }
    @Test
    public void update3() throws Exception{
        System.out.println(preachInformationService.updatePlace("noone","2019.10.2"));
    }
}
