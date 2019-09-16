package com.nenu.market.controller.interview;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
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
@ResponseBody
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
        ParticipationIntention participationIntention = null;
        String PI[] = new String[7];
        int i = 0;
        try{
            map.put("visitorList",visitorService.queryVisitorByCompanyNameAndVisitorName(companyName, visitorName, time));

            participationIntention = participationIntentionService.listByCVT(companyName,visitorName,time);
            if(participationIntention.getAutumn_notnomal() == 1){
                PI[i] = "1";
                i++;
            }
            if(participationIntention.getAutumn_goodquality() == 1){
                PI[i] = "2";
                i++;
            }
            if(participationIntention.getNational() == 1){
                PI[i] = "3";
                i++;
            }
            if(participationIntention.getSpring_notnomal() == 1){
                PI[i] = "4";
                i++;
            }
            if(participationIntention.getSpring_goodquality() == 1){
                PI[i] = "5";
                i++;
            }
            if(participationIntention.getInternet() == 1){
                PI[i] = "6";
                i++;
            }
            if(participationIntention.getNofair() == 1){
                PI[i] = "7";
            }
            map.put("PI",PI);

            map.put("pRList",positionRequirementsService.listPositionRequirementsByCVT(companyName, visitorName, time));
            map.put("positionList",visitPositionService.listVisitPosition(time,visitorName,companyName));
            map.put("schoolFellowList",schoolFellowService.listSchoolFellow(companyName, visitorName, time));
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping(value = "/addInterview")
    public void addInterview(String jv,String jvp,String jpi,String jpr,String jsf
//            @RequestParam(value = "visitor", required = false) Visitor visitor,
//                             @RequestParam(value = "vP[]",required = false) VisitPosition[] vP,
//                             @RequestParam(value = "PI[]",required = false)  String[] PI,
//                             @RequestParam(value = "pR[]",required = false) PositionRequirements[] pR,
//                             @RequestParam(value = "sF[]",required = false) SchoolFellow[] sF, HttpServletRequest httpServletRequest
    ){

//        ParticipationIntention participationIntention = null;
//        VisitPosition visitPosition = null;
//        PositionRequirements positionRequirements = null;
//        SchoolFellow schoolFellow = null;

//        VisitPosition[] vP;
//        String[] PI;
//        PositionRequirements[] pR;
//        SchoolFellow[] sF;


        try{
//            System.out.println(httpServletRequest.getParameter("sF[0][name]"));
            System.out.println(jv);
            System.out.println(jvp);
            System.out.println(jpi);
            System.out.println(jpr);
            System.out.println(jsf);


            JSONObject jvisitor = (JSONObject) JSONObject.parse(jv);
            Visitor visitor = new Visitor();
            visitor.setCompany_name(jvisitor.getString("company_name"));
            visitor.setCompany_nature(jvisitor.getString("company_nature"));
            visitor.setCompany_place(jvisitor.getString("company_place"));
            visitor.setConclude(jvisitor.getString("conclude"));
            visitor.setFeedback(jvisitor.getString("feedback"));
            visitor.setPostcode(jvisitor.getString("postcode"));
            visitor.setTime(jvisitor.getString("time"));
            visitorService.addVisitor(visitor);
            String visitor_name = visitor.getVisitor_name();
            String time = visitor.getTime();

            JSONArray jvP = (JSONArray) JSONArray.parse(jvp);
            for (int i=0; i<jvP.size(); i++) {
                VisitPosition visitPosition = new VisitPosition();
                visitPosition.setTime(jvP.getJSONObject(i).getString("time"));
                visitPosition.setVisitor_name(jvP.getJSONObject(i).getString("visitor_name"));
                visitPosition.setCompany_name(jvP.getJSONObject(i).getString("company_name"));
                visitPosition.setPosition(jvP.getJSONObject(i).getString("position"));
                visitPosition.setContact(jvP.getJSONObject(i).getString("contact"));
                visitPosition.setEmail(jvP.getJSONObject(i).getString("email"));
                visitPosition.setFixedphone(jvP.getJSONObject(i).getString("fixedphone"));
                visitPosition.setMobiephone(jvP.getJSONObject(i).getString("mobilephone"));
                visitPosition.setWebchatqq(jvP.getJSONObject(i).getString("webchatqq"));
            visitPositionService.addVisitPosition(visitPosition);
            }

            JSONArray jPI = (JSONArray) JSONArray.parse(jpi);
            for (int i=0; i<jPI.size(); i++) {
                ParticipationIntention participationIntention = null;
                String pi = (String) jPI.get(i);
                if("1".equals(pi)){
                    participationIntention.setAutumn_notnomal(1);
                }else if("2".equals(pi)){
                    participationIntention.setAutumn_goodquality(1);
                }else if("3".equals(pi)){
                    participationIntention.setNational(1);
                }else if("4".equals(pi)){
                    participationIntention.setSpring_notnomal(1);
                }else if("5".equals(pi)){
                    participationIntention.setSpring_goodquality(1);
                }else if("6".equals(pi)){
                    participationIntention.setInternet(1);
                } else if("7".equals(pi)){
                    participationIntention.setNofair(1);
                }
                participationIntention.setVisitor_name(visitor_name);
                participationIntention.setTime(time);
                participationIntentionService.addParticipationIntention(participationIntention);
            }

            JSONArray jpR = (JSONArray) JSONArray.parse(jpr);
            for (int i=0; i<jpR.size(); i++) {
                PositionRequirements positionRequirements = (PositionRequirements) jpR.get(i);
                positionRequirementsService.addPositionRequirements(positionRequirements);
            }

            JSONArray jsF = (JSONArray) JSONArray.parse(jsf);
            for (int i=0; i<jsF.size(); i++) {
                SchoolFellow schoolFellow = (SchoolFellow) jsF.get(i);
                schoolFellowService.addSchoolFellow(schoolFellow);
            }




//            visitorService.addVisitor(visitor);

//            String visitor_name = visitor.getVisitor_name();
//            String time = visitor.getTime();

//            for(int i=0;i<vP.length;i++){
//                visitPosition = vP[i];
//                visitPosition.setVisitor_name(visitor_name);
//                visitPosition.setTime(time);
//                visitPositionService.addVisitPosition(visitPosition);
//            }

//            for(int i=0;i<pR.length;i++){
//                positionRequirements = pR[i];
//                positionRequirements.setVisitor_name(visitor_name);
//                positionRequirements.setTime(time);
//                positionRequirementsService.addPositionRequirements(positionRequirements);
//            }

//            for(int i=0;i<6;i++){
//                if("1".equals(PI[i])){
//                    participationIntention.setAutumn_notnomal(1);
//                }else if("2".equals(PI[i])){
//                    participationIntention.setAutumn_goodquality(1);
//                }else if("3".equals(PI[i])){
//                    participationIntention.setNational(1);
//                }else if("4".equals(PI[i])){
//                    participationIntention.setSpring_notnomal(1);
//                }else if("5".equals(PI[i])){
//                    participationIntention.setSpring_goodquality(1);
//                }else if("6".equals(PI[i])){
//                    participationIntention.setInternet(1);
//                } else if("7".equals(PI[i])){
//                    participationIntention.setNofair(1);
//                }
//            }
//            participationIntention.setVisitor_name(visitor_name);
//            participationIntention.setTime(time);
//            participationIntentionService.addParticipationIntention(participationIntention);

//            for(int i=0;i<sF.length;i++){
//                schoolFellow = sF[i];
//                schoolFellow.setVisitor_time(visitor_name);
//                schoolFellow.setVisitor_time(time);
//                schoolFellowService.addSchoolFellow(schoolFellow);
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    @RequestMapping(value = "/addInterview")
//    public void addInterview(@RequestBody Map<String,Object> map){
//        //hcy
//        Map<String,String> map1 = (Map) map.get("visitor");
//        //lx
//        Map<String,String> map2 = (Map) map.get("visitPosition");
//        //ljy
//        Map<String,String> map3 = (Map) map.get("pR");
//        Map<String,String> map4 = (Map) map.get("pI");
//        //kyy
//        Map<String,String> map5 = (Map) map.get("schoolFellow");
//
//        Visitor visitor = JSON.parseObject(JSON.toJSONString(map1), Visitor.class);
//        VisitPosition visitPosition = JSON.parseObject(JSON.toJSONString(map2), VisitPosition.class);
//        PositionRequirements pR = JSON.parseObject(JSON.toJSONString(map3), PositionRequirements.class);
//        ParticipationIntention pI = JSON.parseObject(JSON.toJSONString(map3), ParticipationIntention.class);
//        SchoolFellow schoolFellow = JSON.parseObject(JSON.toJSONString(map1), SchoolFellow.class);
//
//        try{
//            visitorService.addVisitor(visitor);
//            String visitor_name = visitor.getVisitor_name();
//            String time = visitor.getTime();
//
//            visitPosition.setVisitor_name(visitor_name);
//            visitPosition.setTime(time);
//            visitPositionService.addVisitPosition(visitPosition);
//
//            pR.setVisitor_name(visitor_name);
//            pR.setTime(time);
//            positionRequirementsService.addPositionRequirements(pR);
//
//            pI.setVisitor_name(visitor_name);
//            pI.setTime(time);
//            participationIntentionService.addParticipationIntention(pI);
//
//            schoolFellow.setVisitor_time(visitor_name);
//            schoolFellow.setVisitor_time(time);
//            schoolFellowService.addSchoolFellow(schoolFellow);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

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

    @RequestMapping(value = "/queryCompany")
    public Map queryCompany(String companyName){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Visitor> visitorList = null;
        List<VisitPosition> positionList = null;
        List<SchoolFellow> schoolFellowList = null;
        try {
            visitorList = visitorService.queryVisitor(companyName,"%");
            map.put("visitorList",visitorList);

            positionList = visitPositionService.queryVisitPosition(companyName,"%");
            map.put("positionList",positionList);

            schoolFellowList = schoolFellowService.querySchoolFellow(companyName,"%");
            map.put("schoolFellowList",schoolFellowList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
