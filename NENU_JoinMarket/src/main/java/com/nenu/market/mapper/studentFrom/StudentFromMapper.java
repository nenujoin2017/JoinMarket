package com.nenu.market.mapper.studentFrom;

import com.nenu.market.entity.studentFrom.StudentFrom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author : kongyy
 * @time : 2019/5/9 8:49
 */
@Mapper
@Repository
public interface StudentFromMapper {

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
    public List<StudentFrom> Select1(@Param("studentFrom") StudentFrom studentFrom) throws Exception;


    /**
     * 查询条件教育类、年份、生源人数
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select2(@Param("studentFrom") StudentFrom studentFrom) throws Exception;

    /**
     * 包含所有查询条件
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select3(@Param("studentFrom") StudentFrom studentFrom) throws Exception;

    /**
     * 查询条件:教育类，年份
     * @param studentFrom
     * @return
     * @throws Exception
     */
    public List<StudentFrom> Select4(@Param("studentFrom") StudentFrom studentFrom) throws Exception;
}
