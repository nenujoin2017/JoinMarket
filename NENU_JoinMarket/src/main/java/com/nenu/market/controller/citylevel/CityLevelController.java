package com.nenu.market.controller.citylevel;

import com.nenu.market.entity.citylevel.CityLevel;
import com.nenu.market.service.citylevel.CityLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author: xinlee,dage
 * @Description:
 * @Date: 14:28 2019/5/22
 */
@CrossOrigin
@RestController
@RequestMapping("/cityLevel")
public class CityLevelController {
    @Autowired
    CityLevelService cityLevelService;

    @RequestMapping(value = "/listAll")
    public List<CityLevel> listAllCityLevel(){
        List<CityLevel> list=null;
        try {
            list=cityLevelService.listAllCityLevel();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/queryByKeyword",consumes = "application/json")
    public List<CityLevel> listAll(@RequestBody String key){
        List<CityLevel> list=null;
        System.out.println(key);
        try {
            if(key==null||"".equals(key)){
                list = cityLevelService.listAllCityLevel();
            }else{
                list=cityLevelService.searchCityLevel(key);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/queryById")
    public CityLevel queryById(@RequestBody String id){
        CityLevel cityLevel = new CityLevel();
        System.out.println(id);
        int idd;
        try {
            if(!(id==null||"".equals(id))){
                id = id.trim();
            }
            idd = Integer.valueOf(id).intValue();
            System.out.println(idd);
            cityLevel=cityLevelService.searchCityLevelById(idd);
            System.out.println(cityLevel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cityLevel;
    }

//    @RequestMapping(value = "/queryByIdForUpdate")
//    public CityLevel queryByIdForUpdate(int id){
//        CityLevel cityLevel = new CityLevel();
//        try {
//            cityLevel=cityLevelService.searchCityLevelById(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return cityLevel;
//    }

    @RequestMapping(value = "/updateCityLevel")
    public void updateCityLevel(@RequestBody String id,@RequestBody String cityRank,@RequestBody String cityGrading,@RequestBody String road){
        CityLevel cityLevel = new CityLevel();
        try {

            System.out.println(id);
            System.out.println(cityRank);
            if(!(id==null||"".equals(id))){
                id = id.trim();
            }
            int idd = Integer.valueOf(id).intValue();
            cityLevel = cityLevelService.searchCityLevelById(idd);
            cityLevel.setCityRank(cityRank);
            cityLevel.setCityGrading(cityGrading);
            cityLevel.setRoad(road);
            cityLevelService.updateCityLevel(cityLevel);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
