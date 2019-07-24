package com.nenu.market.service.student;


import com.nenu.market.entity.student.Student;

import java.util.List;

/**
 * @Author: Liangll
 * @Description: 单位详细信息学生
 * @Date: 22:02 2019/5/9
 */
public interface StudentService {

    public List<Student> listStudentByCompany(int companyId) throws Exception;

    public boolean addStudent(Student student) throws Exception;

    public boolean updateStudentSex(Student student) throws Exception;

    public List<Student> queryStudentByYear(String student_year) throws Exception;
}
