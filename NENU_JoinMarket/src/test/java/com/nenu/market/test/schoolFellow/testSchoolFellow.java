package com.nenu.market.test.schoolFellow;

import com.nenu.market.entity.schoolFellow.SchoolFellow;
import com.nenu.market.service.schoolFellow.SchoolFellowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : kongyy
 * @time : 2019/5/16 8:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testSchoolFellow {

    @Autowired
    SchoolFellowService schoolFellowService;

    @Test
    public void testAddSchoolFellow() throws Exception{
        SchoolFellow schoolFellow = new SchoolFellow();
        schoolFellow.setCompany_name("长春二汽");
        schoolFellow.setContact("13654338899");
        schoolFellow.setEducation("大学");
        schoolFellow.setMajor("软件工程");
        schoolFellow.setName("小明");
        schoolFellow.setTime("2015届");
        schoolFellow.setVisitor_name("打嗝");
        schoolFellow.setVisitor_time("2020/2/2");
        schoolFellowService.addSchoolFellow(schoolFellow);
    }

    @Test
    public void testUpdateSchoolFellow() throws Exception{
        SchoolFellow schoolFellow = new SchoolFellow();
        schoolFellow.setCompany_name("长春ba汽");
        schoolFellow.setContact("13654338899");
        schoolFellow.setEducation("大学");
        schoolFellow.setMajor("软件工程");
        schoolFellow.setName("小明");
        schoolFellow.setTime("2015届");
        schoolFellow.setId(1);
        schoolFellow.setVisitor_name("打嗝");
        schoolFellow.setVisitor_time("2021/7/8");
        schoolFellowService.updateSchoolFellow(schoolFellow);
    }

    @Test
    public void testListSchoolFellow() throws Exception{
        String company_name = "东师";
        String visitor_name = "打嗝";
        System.out.println(schoolFellowService.listSchoolFellow(company_name,visitor_name,"2021/7/8"));
    }

}
