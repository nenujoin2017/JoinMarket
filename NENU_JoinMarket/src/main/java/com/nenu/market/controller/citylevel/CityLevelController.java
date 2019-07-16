package com.nenu.market.controller.citylevel;

import com.nenu.market.entity.citylevel.CityLevel;
import com.nenu.market.service.citylevel.CityLevelService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 14:28 2019/5/22
 */
@CrossOrigin
@RestController
@RequestMapping("/cityLevel")
public class CityLevelController {
    @Resource
    CityLevelService cityLevelService;

    @RequestMapping(value = "/listAll")
    public List<CityLevel> listAllCityLevel(Model model){
        List<CityLevel> list=null;
        try {
            list=cityLevelService.listAllCityLevel();
            System.out.println(list);
            model.addAttribute("list",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @RequestMapping(value = "/queryByKeyword" )
    public List<CityLevel> listAll(Model model,String key){
        List<CityLevel> list=null;
        try {
            list=cityLevelService.searchCityLevel(key);
            model.addAttribute("list",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @RequestMapping(value = "/queryById")
    public CityLevel queryById(Model model,int id){
        CityLevel cityLevel=new CityLevel();
        try {
            cityLevel=cityLevelService.searchCityLevelById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cityLevel;
    }
}
