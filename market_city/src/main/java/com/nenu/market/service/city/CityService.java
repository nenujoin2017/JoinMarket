package com.nenu.market.service.city;

import com.nenu.market.entity.city.City;

import java.util.List;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 9:25 2019/5/9
 */
public interface CityService {

    public List<City> listAllCity() throws Exception;

    public boolean addCity(City city) throws Exception;

    public City selectByCityName(String city_name) throws Exception;

    public boolean updateCitySign(City city) throws Exception;

    public boolean updateCityExpect(City city) throws Exception;

    public boolean updateCityStudentFrom(City city) throws Exception;

}
