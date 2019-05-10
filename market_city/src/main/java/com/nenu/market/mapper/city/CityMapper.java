package com.nenu.market.mapper.city;

import com.nenu.market.entity.city.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 0:07 2019/5/9
 */
@Mapper
@Repository
public interface CityMapper {

    public List<City> listAllCity() throws Exception;

    public boolean addCity(@Param("City") City city) throws Exception;

    public City selectByCityName(@Param("city_name") String city_name) throws Exception;

    public boolean updateCityExpect(@Param("city") City city) throws Exception;

    public boolean updateCitySign(@Param("city") City city) throws Exception;

    public boolean updateCityStudentFrom(@Param("city") City city) throws Exception;

}
