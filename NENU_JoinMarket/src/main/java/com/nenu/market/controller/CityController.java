package com.nenu.market.controller;

import com.nenu.market.service.cityservice.CityServiceXY;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    CityServiceXY cityServiceXY;
    @RequestMapping("/citySign")
    public List listCitySign(int year){
        return cityServiceXY.getCitySignByYear(year);
    }
    @RequestMapping("/cityEx")
    public List listCityEx(int year){
        return cityServiceXY.getCityExByYear(year);
    }
}
