package com.nenu.market.controller.preach;

import com.nenu.market.entity.PreachInformation.PreachInformation;
import com.nenu.market.service.preachinformation.PreachInformationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/preach")
public class PreachController {
    @Resource
    PreachInformationService preachInformationService;


    @RequestMapping("/listAll")
    public List<PreachInformation> listStudentByCompany(String companyName) throws Exception {
        return preachInformationService.listAll();
    }

    @RequestMapping("/queryByTime")
    public List<PreachInformation> queryStudentByYear(String time){
        List list= null;
        try {
            list = preachInformationService.searchByTime(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
