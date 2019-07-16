package com.nenu.market.mapper.city;

import com.nenu.market.entity.city.Education;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NonEducationMapper {

    /**
     * 遍历
     */
    public List<Education> listAllNonEducation() throws Exception;


    /**
     * 根据关键字查询
     */
    public List<Education> queryNonEducationByKeyword(@Param("keyword") String keyword) throws Exception;
}
