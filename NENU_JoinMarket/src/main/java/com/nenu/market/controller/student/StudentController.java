package com.nenu.market.controller.student;

import com.nenu.market.entity.student.Student;
import com.nenu.market.service.student.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Liangll
 * @Description: StudentController层（与前端页面进行交互）
 * @Date: 10:54 2019/5/16
 */
@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentService studentService;

    /**
     * 列出所有学生信息
     * @param companyIdStr 单位编号
     * @return 返回List形式的学生信息
     */
    @ResponseBody
    @RequestMapping("/listStudentByCompany")
    public List<Student> listStudentByCompany(String companyIdStr){
        int companyId = Integer.parseInt(companyIdStr);
        List<Student> studentList = null;
        try {
            studentList = studentService.listStudentByCompany(companyId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }

    /**
     * 根据年份列出学生信息
     * @param studentYearStr
     * @return
     */
    @ResponseBody
    @RequestMapping("/queryStudentByYear")
    public List<Student> queryStudentByYear(String studentYearStr){
        List<Student> studentList = null;
        try {
            studentList = studentService.queryStudentByYear(studentYearStr);
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }

}
