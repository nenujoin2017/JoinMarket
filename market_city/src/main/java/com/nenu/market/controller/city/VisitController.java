package com.nenu.market.controller.city;

import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/testBoot1")
public class VisitController {

    @Autowired
    VisitService visitService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAll1")
    public List<Education> visitList(Model model) {
        List<Education> list = null;
        try {
            list = visitService.listAll1();
            model.addAttribute("visitList",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据教育类或非教育类查询
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectByEducationYon")
    public List<Education> visitList1(String education_yon,Model model){
        List<Education> list1 = null;
        try {
            list1 = visitService.selectByEducationYon(education_yon);
            model.addAttribute("visitList1",list1);
            System.out.println(education_yon);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list1;
    }

    /**
     * 根据城市名查询
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectByCityName")
    public List<Education> visitList2(String city_name,Model model){
        List<Education> list2 = null;
        try{
            list2 = visitService.selectByCityName(city_name);
            model.addAttribute("visitList2",list2);
            System.out.println(city_name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list2;
    }
}
