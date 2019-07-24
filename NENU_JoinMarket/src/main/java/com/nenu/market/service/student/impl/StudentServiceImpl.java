package com.nenu.market.service.student.impl;

import com.nenu.market.entity.student.Student;
import com.nenu.market.mapper.student.StudentMapper;
import com.nenu.market.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Liangll
 * @Description: 单位详细信息学生
 * @Date: 22:02 2019/5/9
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> listStudentByCompany(int companyId) throws Exception{
        List<Student> studentList = Collections.emptyList();
        studentList = studentMapper.listStudentByCompany(companyId);
        return studentList;
    }

    @Override
    public boolean addStudent(Student student) throws Exception{
        return studentMapper.addStudent(student);
    }

    @Override
    public boolean updateStudentSex(Student student) throws Exception{
        return studentMapper.updateStudentSex(student);
    }

    @Override
    public List<Student> queryStudentByYear(String student_year) throws Exception{
        List<Student> studentList = Collections.emptyList();
        studentList = studentMapper.queryStudentByYear(student_year);
        return studentList;
    }

}
