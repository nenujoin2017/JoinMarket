package com.nenu.market.mapper.city;

import com.nenu.market.entity.city.Education;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VisitMapper {

    /**
     * 遍历
     */
    public List<Education> listAll1() throws Exception;

    /**
     * 根据教育类还是非教育类查询
     */
    public List<Education> selectByEducationYon(String education_yon) throws Exception;

    /**
     * 根据城市名查询
     */
    public List<Education> selectByCityName(String city_name) throws Exception;
}
