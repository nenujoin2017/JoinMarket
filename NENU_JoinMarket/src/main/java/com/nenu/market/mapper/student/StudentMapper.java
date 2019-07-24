package com.nenu.market.mapper.student;

import com.nenu.market.entity.student.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Liangll
 * @Description: 单位详细信息学生
 * @Date: 22:02 2019/5/9
 */
@Mapper
@Repository
public interface StudentMapper {

    public List<Student> listStudentByCompany(@Param("companyId") int companyId) throws Exception;

    public boolean addStudent(@Param("student") Student student) throws Exception;

    public boolean updateStudentSex(@Param("student") Student student) throws Exception;

    public boolean updateStudentNation(@Param("student") Student student) throws Exception;

    public boolean updateStudentCollege(@Param("student") Student student) throws Exception;

    public boolean updateStudentMajor(@Param("student") Student student) throws Exception;

    public boolean updateStudentPosition(@Param("student") Student student) throws Exception;

    public boolean updateStudentSignCompany(@Param("student") Student student) throws Exception;

    public Student queryByStudentName(@Param("studentName") String studentName) throws Exception;

    public List<Student> queryStudentByYear(@Param("student_year") String student_year) throws Exception;

}
