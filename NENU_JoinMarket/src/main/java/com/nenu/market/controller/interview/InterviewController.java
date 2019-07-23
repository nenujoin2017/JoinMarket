package com.nenu.market.controller.interview;

import com.alibaba.fastjson.JSON;
import com.nenu.market.entity.citylevel.CityLevel;
import com.nenu.market.entity.participation_intention.ParticipationIntention;
import com.nenu.market.entity.position_requirements.PositionRequirements;
import com.nenu.market.entity.schoolFellow.SchoolFellow;
import com.nenu.market.entity.studentFrom.StudentFrom;
import com.nenu.market.entity.visitor.Visitor;
import com.nenu.market.entity.visitorPosition.VisitPosition;
import com.nenu.market.service.citylevel.CityLevelService;
import com.nenu.market.service.participation_intension.ParticipationIntentionService;
import com.nenu.market.service.position_requirements.PositionRequirementsService;
import com.nenu.market.service.schoolFellow.SchoolFellowService;
import com.nenu.market.service.studentfrom.StudentFromService;
import com.nenu.market.service.visitor.VisitorService;
import com.nenu.market.service.visitorPosition.VisitPositionService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: DAGE
 * @Description:
 * @Date: 14:28 2019/7/18
 */
@CrossOrigin
@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Resource
    VisitorService visitorService;

    @Resource
    VisitPositionService visitPositionService;

    @Resource
    PositionRequirementsService positionRequirementsService;

    @Resource
    ParticipationIntentionService participationIntentionService;

    @Resource
    SchoolFellowService schoolFellowService;

    @RequestMapping(value = "/listAll")
    public Map listAllInterview() {
        Map<String,Object> map = new HashMap<String,Object>();
        List<Visitor> visitorList = null;
        List<VisitPosition> positionList = null;
        try {
            visitorList = visitorService.listAllVisitor();
            map.put("visitorList",visitorList);

            positionList = visitPositionService.listAllVisitPosition();
            map.put("positionList",positionList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping(value = "/queryInterview")
    public Map queryInterview(String keyword, String year){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Visitor> visitorList = null;
        List<VisitPosition> positionList = null;
        try {
            System.out.println(keyword);
            System.out.println(year);
            visitorList = visitorService.queryVisitor(keyword,year);
            map.put("visitorList",visitorList);

            positionList = visitPositionService.queryVisitPosition(keyword,year);
            map.put("positionList",positionList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping(value = "/queryByCnAndVn")
    public Map queryInterviewByCompanyNameAndVisitorName(String companyName,String visitorName,String time){
        Map<String,Object> map = new HashMap<String,Object>();
        try{
            map.put("visitorList",visitorService.queryVisitorByCompanyNameAndVisitorName(companyName, visitorName, time));
            map.put("pIList",participationIntentionService.listByCVT(companyName, visitorName, time));
            map.put("pRList",positionRequirementsService.listPositionRequirementsByCVT(companyName, visitorName, time));
            map.put("positionList",visitPositionService.listVisitPosition(time,visitorName,companyName));
            map.put("schoolFellowList",schoolFellowService.listSchoolFellow(companyName, visitorName, time));
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping(value = "/addInterview")
    public void addInterview(@RequestBody Map<String,Object> map){
        //hcy
        Map<String,String> map1 = (Map) map.get("visitor");
        //lx
        Map<String,String> map2 = (Map) map.get("visitPosition");
        //ljy
        Map<String,String> map3 = (Map) map.get("pR");
        Map<String,String> map4 = (Map) map.get("pI");
        //kyy
        Map<String,String> map5 = (Map) map.get("schoolFellow");

        Visitor visitor = JSON.parseObject(JSON.toJSONString(map1), Visitor.class);
        VisitPosition visitPosition = JSON.parseObject(JSON.toJSONString(map2), VisitPosition.class);
        PositionRequirements pR = JSON.parseObject(JSON.toJSONString(map3), PositionRequirements.class);
        ParticipationIntention pI = JSON.parseObject(JSON.toJSONString(map3), ParticipationIntention.class);
        SchoolFellow schoolFellow = JSON.parseObject(JSON.toJSONString(map1), SchoolFellow.class);

        try{
            visitorService.addVisitor(visitor);
            String visitor_name = visitor.getVisitor_name();
            String time = visitor.getTime();

            visitPosition.setVisitor_name(visitor_name);
            visitPosition.setTime(time);
            visitPositionService.addVisitPosition(visitPosition);

            pR.setVisitor_name(visitor_name);
            pR.setTime(time);
            positionRequirementsService.addPositionRequirements(pR);

            pI.setVisitor_name(visitor_name);
            pI.setTime(time);
            participationIntentionService.addParticipationIntention(pI);

            schoolFellow.setVisitor_time(visitor_name);
            schoolFellow.setVisitor_time(time);
            schoolFellowService.addSchoolFellow(schoolFellow);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/updateInterview")
    public void updateInterview(@RequestBody Map<String,Object> map){
        //hcy
        Map<String,String> map1 = (Map) map.get("visitor");
        //lx
        Map<String,String> map2 = (Map) map.get("visitPosition");
        //ljy
        Map<String,String> map3 = (Map) map.get("pR");
        Map<String,String> map4 = (Map) map.get("pI");
        //kyy
        Map<String,String> map5 = (Map) map.get("schoolFellow");

        Visitor visitor = JSON.parseObject(JSON.toJSONString(map1), Visitor.class);
        VisitPosition visitPosition = JSON.parseObject(JSON.toJSONString(map2), VisitPosition.class);
        PositionRequirements pR = JSON.parseObject(JSON.toJSONString(map3), PositionRequirements.class);
        ParticipationIntention pI = JSON.parseObject(JSON.toJSONString(map3), ParticipationIntention.class);
        SchoolFellow schoolFellow = JSON.parseObject(JSON.toJSONString(map1), SchoolFellow.class);

        try{
            visitorService.updateVisitor(visitor);
            String visitor_name = visitor.getVisitor_name();
            String time = visitor.getTime();

            visitPosition.setVisitor_name(visitor_name);
            visitPosition.setTime(time);
            visitPositionService.updateVisitPosition(visitPosition);

            pR.setVisitor_name(visitor_name);
            pR.setTime(time);
            positionRequirementsService.updatePositionRequirements(pR);

            pI.setVisitor_name(visitor_name);
            pI.setTime(time);
            participationIntentionService.updateParticipationIntention(pI);

            schoolFellow.setVisitor_time(visitor_name);
            schoolFellow.setVisitor_time(time);
            schoolFellowService.updateSchoolFellow(schoolFellow);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
