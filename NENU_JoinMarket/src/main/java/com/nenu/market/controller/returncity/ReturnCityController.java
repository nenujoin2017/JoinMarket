package com.nenu.market.controller.returncity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
    public String listAll() throws Exception{
        List<ReturnCity> list = Collections.emptyList();
        list = returnCityService.listAllReturnCity();
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
        for(int i=0;i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String returnCountStr = jsonObject.getString("returnCount");
            String visitCountStr = jsonObject.getString("visitCount");
            int returnCount = Integer.parseInt(returnCountStr);
            Double visitCount = Double.parseDouble(visitCountStr);
            Double return_rate = returnCount/visitCount;
            return_rate *= 100;
            String student_ratestr = String.valueOf(return_rate);
            student_ratestr += "%";
            System.out.println(student_ratestr);
            jsonObject.put("return_rate", student_ratestr);
            if(visitCount>10){
                jsonObject.put("student_rank", "A");
            }else if(visitCount>5){
                jsonObject.put("student_rank", "B");
            }else if(visitCount>3){
                jsonObject.put("student_rank", "C");
            }else if(visitCount>1){
                jsonObject.put("student_rank", "D");
            }else {
                jsonObject.put("student_rank", "E");
            }
        }
        String list2 = array.toString();
        return list2;
    }

    @RequestMapping(value = "select")
    public String selectCity(String education, String Syear, String city_name){
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
        returnCity.setCity_year(year);
        returnCity.setCity_name(city_name);
        try{
            if(city_name == "城市"){
                list1 = returnCityService.SelectCity2(returnCity);
            }else{
                list1 = returnCityService.SelectCity1(returnCity);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list1));
        for(int i=0;i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String returnCountStr = jsonObject.getString("returnCount");
            String visitCountStr = jsonObject.getString("visitCount");
            int returnCount = Integer.parseInt(returnCountStr);
            Double visitCount = Double.parseDouble(visitCountStr);
            Double return_rate = returnCount/visitCount;
            return_rate *= 100;
            String student_ratestr = String.valueOf(return_rate);
            student_ratestr += "%";
            System.out.println(student_ratestr);
            jsonObject.put("return_rate", student_ratestr);
            if(visitCount>10){
                jsonObject.put("student_rank", "A");
            }else if(visitCount>5){
                jsonObject.put("student_rank", "B");
            }else if(visitCount>3){
                jsonObject.put("student_rank", "C");
            }else if(visitCount>1){
                jsonObject.put("student_rank", "D");
            }else {
                jsonObject.put("student_rank", "E");
            }
        }
        String list2 = array.toString();
        return list2;
    }

}
