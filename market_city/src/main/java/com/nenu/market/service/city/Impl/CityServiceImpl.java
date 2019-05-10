package com.nenu.market.service.city.Impl;

import com.nenu.market.entity.city.City;
import com.nenu.market.mapper.city.CityMapper;
import com.nenu.market.service.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 9:26 2019/5/9
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    @Override
    public boolean addCity(City city) throws Exception {
        return cityMapper.addCity(city);
    }

    @Override
    public List<City> listAllCity() throws Exception{
        List<City> cityList = Collections.emptyList();
        try{
            cityList = cityMapper.listAllCity();
        }catch (Exception e){
            System.out.println("列出城市出错");
            e.printStackTrace();
        }
        return cityList;
    }

    @Override
    public City selectByCityName(String city_name) throws Exception {
        return cityMapper.selectByCityName(city_name);
    }

    @Override
    public boolean updateCitySign(City city) throws Exception {
        return cityMapper.updateCitySign(city);
    }

    @Override
    public boolean updateCityExpect(City city) throws Exception {
        return cityMapper.updateCityExpect(city);
    }

    @Override
    public boolean updateCityStudentFrom(City city) throws Exception {
        return cityMapper.updateCityStudentFrom(city);
    }

}
