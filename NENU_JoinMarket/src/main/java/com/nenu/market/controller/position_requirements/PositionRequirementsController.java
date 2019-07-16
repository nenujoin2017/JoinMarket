package com.nenu.market.controller.position_requirements;

import com.nenu.market.entity.position_requirements.PositionRequirements;
import com.nenu.market.service.position_requirements.PositionRequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 14:46 2019/5/17
 */

@CrossOrigin
@RestController
@RequestMapping("/positionRequirements")
public class PositionRequirementsController {

    @Autowired
    PositionRequirementsService positionRequirementsService;

    /**
     * 增加一条岗位需求信息
     * @param positionRequirements
     * @return
     */
    @RequestMapping(value = "/addPositionRequirements")
    public PositionRequirements addPositionRequirements(PositionRequirements positionRequirements){
        try{
            positionRequirements = positionRequirementsService.addPositionRequirements(positionRequirements);
        }catch (Exception e){
            e.printStackTrace();
        }
        return positionRequirements;
    }


    /**
     * 编辑一条岗位需求信息
     * @param positionRequirements
     * @return
     */
    @RequestMapping(value = "/updatePositionRequirements")
    public PositionRequirements updatePositionRequirements(PositionRequirements positionRequirements){
        try{
            positionRequirements = positionRequirementsService.updatePositionRequirements(positionRequirements);
        }catch (Exception e){
            e.printStackTrace();
        }
        return positionRequirements;
    }


    /**
     * 根据关键字查询一条岗位需求信息
     * @param keyword
     * @param model
     * @return
     */
    @RequestMapping(value = "/queryPositionRequirementsByKeyword")
    public List<PositionRequirements> queryPositionRequirementsByKeyword(String keyword,Model model){
        List<PositionRequirements> resultList = null;
        try {
            resultList = positionRequirementsService.queryPositionRequirementsByKeyword(keyword);
            model.addAttribute("resultList",resultList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList;
    }

    /**
     * 遍历所有岗位需求信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAllPositionRequirements")
    public List<PositionRequirements> listAllPositionRequirements(Model model){
        List<PositionRequirements> list = null;
        try {
            list = positionRequirementsService.listAllPositionRequirements();
            model.addAttribute("list",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}

