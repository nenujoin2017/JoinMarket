package com.nenu.market.test.student;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.student.Student;
import com.nenu.market.service.student.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:Liangll
 * @Description: 测试StudentService的各类方法
 * @Date: 11:44 2019/5/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testListStudentByCompany() throws Exception{
        int companyId = 2;
        System.out.println(studentService.listStudentByCompany(companyId));
    }

    @Test
    public void testAddStudent() throws Exception {
        Student student = new Student();
        student.setStudentName("测试增加学生");
        student.setSex("女");
        student.setNation("测试增加学生民族");
        student.setEducation("测试增加学生学历");
        student.setSignType("测试增加签约类别");
        student.setCollege("测试增加学院");
        student.setMajor("测试增加专业");
        student.setStudentFrom("测试增加生源地");
        student.setPosition("测试增加职位");
        student.setStudent_year("测试增加年份");
        student.setSignCompany("测试增加签约单位名称");
        student.setCompanyId(2);
        studentService.addStudent(student);
    }

    @Test
    public void testUpdateStudentCompanyId() throws Exception{
        Student student = new Student();
        student.setSignCompany("恒大");
        student.setCompanyId(2);
        System.out.println(studentService.updateStudentCompanyId(student));
    }

    @Test
    public void testSelectStudentByYear() throws Exception{
        String student_year = "2019";
        System.out.println(studentService.queryStudentByYear(student_year));
    }

    @Test
    public void testProcess() throws Exception{
        String list1 = "[{\"学生姓名\":\"张三\",\"期望城市\":\"长春市\",\"签约城市\":\"洛阳市\",\"生源城市\":\"郑州市\",\"性别\":\"女\",\"民族\":\"汉族\",\"学院\":\"信息科学与技术学院\",\"专业\":\"软件工程\",\"职位\":\"程序员\",\"签约单位\":\"恒大\"},\n" +
                "        {\"学生姓名\":\"李四\",\"期望城市\":\"北京市\",\"签约城市\":\"洛阳市\",\"生源城市\":\"柳州市\",\"性别\":\"男\",\"民族\":\"壮族\",\"学院\":\"物理学院\",\"专业\":\"物理\",\"职位\":\"文员\",\"签约单位\":\"恒大\"}]";

        JSONArray array = JSONArray.parseArray(list1);
        for(int i=0;i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String studentNameStr = jsonObject.getString("学生姓名");
            Student student = new Student();
            student.setStudentName(studentNameStr);
            studentService.addStudent(student);
        }

    }

}
