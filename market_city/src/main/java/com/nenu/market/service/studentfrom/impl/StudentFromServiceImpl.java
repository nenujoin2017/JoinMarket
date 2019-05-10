package com.nenu.market.service.studentfrom.impl;

import com.nenu.market.entity.studentFrom.StudentFrom;
import com.nenu.market.mapper.studentFrom.StudentFromMapper;
import com.nenu.market.service.studentfrom.StudentFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2019/5/9 8:59
 */
@Service
public class StudentFromServiceImpl implements StudentFromService {


    @Autowired
    StudentFromMapper studentFromMapper;

    @Override
    public List<StudentFrom> listStudentFrom() throws Exception {
        List<StudentFrom> studentFromList = Collections.emptyList();
        try{
            studentFromList = studentFromMapper.listStudentFrom();
        }catch (Exception ex){
            System.out.println("列出生源城市出错");
            ex.printStackTrace();
        }
        return studentFromList;
    }

    @Override
    public List<StudentFrom> Select1(StudentFrom studentFrom) throws Exception {
        List<StudentFrom> selectList1 = Collections.emptyList();
        try{
            selectList1 = studentFromMapper.Select1(studentFrom);
        }catch (Exception ex){
            System.out.println("列出生源城市出错");
        }
        return selectList1;
    }

    @Override
    public List<StudentFrom> Select2(StudentFrom studentFrom) throws Exception {
        List<StudentFrom> selectList2 = Collections.emptyList();
        try{
            selectList2 = studentFromMapper.Select2(studentFrom);
        }catch (Exception ex){
            System.out.println("列出生源城市出错");
        }
        return selectList2;
    }

    @Override
    public List<StudentFrom> Select3(StudentFrom studentFrom) throws Exception {
        List<StudentFrom> selectList3 = Collections.emptyList();
        try{
            selectList3 = studentFromMapper.Select3(studentFrom);
        }catch (Exception ex){
            System.out.println("列出生源城市出错");
        }
        return selectList3;
    }

    @Override
    public List<StudentFrom> Select4(StudentFrom studentFrom) {
        List<StudentFrom> selectList4 = Collections.emptyList();
        try{
            selectList4 = studentFromMapper.Select4(studentFrom);
        }catch (Exception ex){
            System.out.println("列出生源城市出错");
        }
        return selectList4;
    }
}
