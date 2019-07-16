package com.nenu.market.service.returncity.impl;

import com.nenu.market.entity.returncity.ReturnCity;
import com.nenu.market.mapper.returncity.ReturnCityMapper;
import com.nenu.market.service.returncity.ReturnCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReturnCityServiceImpl implements ReturnCityService{

    @Autowired
    ReturnCityMapper returnCityMapper;

    @Override
    public List<ReturnCity> listAllReturnCity() {
        List<ReturnCity> returnCityList = Collections.emptyList();
        try{
            returnCityList = returnCityMapper.listAllReturnCity();
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("城市回访出错");
        }
        return returnCityList;
    }


    @Override
    public List<ReturnCity> SelectCity1(ReturnCity returnCity) {
        List<ReturnCity> selectCity1 = Collections.emptyList();
        try{
            selectCity1 = returnCityMapper.SelectCity1(returnCity);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("查询1失败");
        }
        return selectCity1;
    }

    @Override
    public List<ReturnCity> SelectCity2(ReturnCity returnCity) {
        List<ReturnCity> selectCity2 = Collections.emptyList();
        try{
            selectCity2 = returnCityMapper.SelectCity2(returnCity);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("查询2失败");
        }
        return selectCity2;
    }
}
