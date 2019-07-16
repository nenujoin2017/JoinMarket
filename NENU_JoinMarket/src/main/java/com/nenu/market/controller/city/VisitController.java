package com.nenu.market.controller.city;

import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    VisitService visitService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAllVisit")
    public List<Education> visitList(Model model) {
        List<Education> list = null;
        try {
            list = visitService.listAllVisit();
            model.addAttribute("visitList",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据关键字查询
     * @param keyword
     * @param model
     * @return
     */
    @RequestMapping(value = "/queryVisitByKeyword")
    public List<Education> queryVisitByKeyword(String keyword,Model model){
        List<Education> list = null;
        try {
            list = visitService.queryVisitByKeyword(keyword);
            model.addAttribute("visitList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
