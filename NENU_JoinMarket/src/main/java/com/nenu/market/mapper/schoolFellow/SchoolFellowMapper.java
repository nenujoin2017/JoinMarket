package com.nenu.market.mapper.schoolFellow;

import com.nenu.market.entity.schoolFellow.SchoolFellow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : kongyy dage
 * @time : 2019/5/15 21:44
 */
@Mapper
@Repository
public interface SchoolFellowMapper {

    public List<SchoolFellow> listSchoolFellow(@Param("company_name") String company_name, @Param("visitor_name") String visitor_name, @Param("visitor_time") String visitor_time) throws Exception;

    public boolean addSchoolFellow(@Param("schoolFellow") SchoolFellow schoolFellow) throws Exception;

    public boolean updateSchoolFellow(@Param("schoolFellow") SchoolFellow schoolFellow) throws Exception;

//    public List<SchoolFellow> querySchoolFellow(@Param("key") String keyword,@Param("year") int year) throws Exception;
}
