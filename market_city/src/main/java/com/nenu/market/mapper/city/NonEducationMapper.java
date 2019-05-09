package com.nenu.market.mapper.city;

import com.nenu.market.entity.city.Education;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NonEducationMapper {

    /**
     * 遍历
     */
    public List<Education> listAll2() throws Exception;


    /**
     * 根据关键字查询
     */
    public List<Education> selectEducationByKeyword(String keyword) throws Exception;
}
