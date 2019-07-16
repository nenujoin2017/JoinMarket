package com.nenu.market.controller.city;

import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/education")
public class EducationController{
    @Autowired
    EducationService educationService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAllEducation")
    public List<Education> educationList(Model model){
        List<Education> list = null;
        try {
            list=educationService.listAllEducation();
            model.addAttribute("educationList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/queryEducationByKeyword")
    public List<Education> selectEducationByKeyword(String keyword,Model model){
        List<Education> resultList = null;
        try {
            resultList = educationService.queryEducationByKeyword(keyword);
            model.addAttribute("resultList",resultList);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList;
    }

}
