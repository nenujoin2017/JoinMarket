package com.nenu.market.test.city;

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
@RequestMapping("/testBoot4")
public class NonEducationControllerTest {
    @Autowired
    NonEducationService nonEducationService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAll4")
    public List<Education> nonEducationList(Model model){
        List<Education> list = null;
        try {
            list=nonEducationService.listAll();
            model.addAttribute("nonEducationList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/selectEducationByKeyword4")
    public List<Education> selectEducationByKeyword(String keyword,Model model){
        List<Education> resultList1 = null;
        try {
            resultList1 = nonEducationService.selectEducationByKeyword(keyword);
            model.addAttribute("resultList1",resultList1);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList1;
    }

}