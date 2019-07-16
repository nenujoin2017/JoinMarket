package com.nenu.market.service.cityservice.impl;

import com.nenu.market.mapper.citymapper.CityMapperXY;
import com.nenu.market.service.cityservice.CityServiceXY;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cityServiceXY")
public class CityServiceXYImpl implements CityServiceXY {
    @Resource
    CityMapperXY cityMapperXY;

    @Override
    public List getCitySignByYear(int year) {
        return cityMapperXY.getCitySignByYear(year);
    }

    @Override
    public List getCityExByYear(int year) {
        return cityMapperXY.getCityExByYear(year);
    }
}
