package com.nenu.market.mapper.city;

import com.nenu.market.entity.city.Education;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EducationMapper {

    /**
     * 遍历
     */
    public List<Education> listAllEducation() throws Exception;


    /**
     * 根据关键字查询
     */
    public List<Education> queryEducationByKeyword(@Param("keyword") String keyword) throws Exception;
}
