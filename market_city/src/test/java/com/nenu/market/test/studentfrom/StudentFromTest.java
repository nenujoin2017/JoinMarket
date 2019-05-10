package com.nenu.market.test.studentfrom;

import com.nenu.market.entity.studentFrom.StudentFrom;
import com.nenu.market.service.studentfrom.StudentFromService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : kongyy
 * @time : 2019/5/9 9:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentFromTest {

    @Autowired
    StudentFromService studentFromService;

    @Test
    public void testList() throws Exception{
        System.out.println(studentFromService.listStudentFrom());
    }

    @Test
    public void testSelect1() throws Exception{
        StudentFrom studentFrom = new StudentFrom();
        studentFrom.setEducation_yon(1);
        studentFrom.setYear(2019);
        studentFrom.setCity_name("长春市");
        System.out.println(studentFromService.Select1(studentFrom));
    }

    @Test
    public void testSelect2() throws Exception{
        StudentFrom studentFrom = new StudentFrom();
        studentFrom.setEducation_yon(1);
        studentFrom.setYear(2019);
        studentFrom.setMax(2000);
        studentFrom.setMin(500);
        System.out.println(studentFromService.Select2(studentFrom));
    }

    @Test
    public void testSelect3() throws Exception{
        StudentFrom studentFrom = new StudentFrom();
        studentFrom.setEducation_yon(1);
        studentFrom.setYear(2019);
        studentFrom.setMax(2000);
        studentFrom.setMin(500);
        studentFrom.setCity_name("长春市");
        System.out.println(studentFromService.Select3(studentFrom));
    }

    @Test
    public void testSelect4() throws Exception{
        StudentFrom studentFrom = new StudentFrom();
        studentFrom.setEducation_yon(1);
        studentFrom.setYear(2019);
        System.out.println(studentFromService.Select4(studentFrom));
    }
}
