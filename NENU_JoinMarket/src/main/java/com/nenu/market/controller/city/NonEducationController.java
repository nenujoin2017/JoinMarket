package com.nenu.market.controller.city;

import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.NonEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/nonEducation")
public class NonEducationController {
    @Autowired
    NonEducationService nonEducationService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAllNonEducation")
    public List<Education> nonEducationList(Model model){
        List<Education> list = null;
        try {
            list=nonEducationService.listAllNonEducation();
            model.addAttribute("nonEducationList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/queryNonEducationByKeyword")
    public List<Education> queryNonEducationByKeyword(String keyword,Model model){
        List<Education> resultList = null;
        try {
            resultList = nonEducationService.queryNonEducationByKeyword(keyword);
            model.addAttribute("resultList",resultList);
            System.out.println(resultList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList;
    }

}
