package com.nenu.market.test.city;

import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/testBoot3")
public class EducationControllerTest{
    @Autowired
    EducationService educationService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAll3")
    public List<Education> educationList(Model model){
        List<Education> list = null;
        try {
            list=educationService.listAll();
            model.addAttribute("educationList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/selectEducationByKeyword3")
    public List<Education> selectEducationByKeyword(String keyword,Model model){
        List<Education> resultList1 = null;
        try {
            resultList1 = educationService.selectEducationByKeyword(keyword);
            model.addAttribute("resultList1",resultList1);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList1;
    }

}

