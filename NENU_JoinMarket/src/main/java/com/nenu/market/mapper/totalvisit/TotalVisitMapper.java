package com.nenu.market.mapper.totalvisit;

import com.nenu.market.entity.totalvisit.TotalVisit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 22:02 2019/5/9
 */
@Mapper
@Repository
public interface TotalVisitMapper {

    public boolean addTotalVisit(@Param("TotalVisit") TotalVisit totalVisit) throws Exception;

    public TotalVisit selectByCityName(@Param("city_name") String city_name) throws Exception;

    public boolean updateCityReturnCount(@Param("TotalVisit") TotalVisit totalVisit) throws Exception;

    public boolean updateCityVisitCount(@Param("TotalVisit") TotalVisit totalVisit) throws Exception;

}
