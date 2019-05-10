package com.nenu.market.controller.returncity;

import com.nenu.market.entity.returncity.ReturnCity;

import com.nenu.market.service.returncity.ReturnCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2019/5/8 19:37
 */
@CrossOrigin
@RestController
@RequestMapping("/returnCity")
public class ReturnCityController {

    @Autowired
    ReturnCityService returnCityService;

    @RequestMapping(value = "/listAll")
    public List<ReturnCity> listAll(Model model){
        List<ReturnCity> list = Collections.emptyList();
        try{
            list = returnCityService.listAllReturnCity();
            model.addAttribute("listAll", list);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "select")
    public List<ReturnCity> selectCity(Model model, String education, String Syear, String city_name){
        List<ReturnCity> list1 = Collections.emptyList();
        int education_yon = 1;
        if(education == "教育类"){
            education_yon = 1;
        }
        if(education == "非教育类"){
            education_yon = 0;
        }
        int year = Integer.parseInt(Syear);
        ReturnCity returnCity = new ReturnCity();
        returnCity.setEducation_yon(education_yon);
        returnCity.setYear(year);
        returnCity.setCity_name(city_name);
        try{
            if(city_name == ""){
                list1 = returnCityService.SelectCity1(returnCity);
            }else{
                list1 = returnCityService.SelectCity2(returnCity);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list1;
    }

}
