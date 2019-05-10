package com.nenu.market.service.studentfrom;

import com.nenu.market.entity.studentFrom.StudentFrom;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2019/5/9 8:58
 */
public interface StudentFromService {

    /**
     * list方法
     * @return
     * @throws Exception
     */
    public List<StudentFrom> listStudentFrom() throws Exception;

    /**
     * 查询条件教育类、年份、城市
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select1(StudentFrom studentFrom) throws Exception;


    /**
     * 查询条件教育类、年份、生源人数
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select2(StudentFrom studentFrom) throws Exception;

    /**
     * 包含所有查询条件
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select3(StudentFrom studentFrom) throws Exception;


    /**
     * 包含教育类、年份
     * @param studentFrom
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select4(StudentFrom studentFrom) throws Exception;

}
