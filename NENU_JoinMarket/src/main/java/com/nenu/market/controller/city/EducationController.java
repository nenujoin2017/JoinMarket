package com.nenu.market.controller.city;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/education")
public class EducationController{
    @Autowired
    EducationService educationService;

    /**
     * 遍历
     * @param
     * @return
     */
    @RequestMapping(value = "/listAllEducation")
    public String educationList() throws Exception{
        List<Education> list = Collections.emptyList();
            list=educationService.listAllEducation();
            JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));

            double a=0,b=0,c=0,d=0,e=0,f=0;
            //城市回访
            for(int i=0;i<array.size();i++) {
                JSONObject jsonObject = array.getJSONObject(i);
                String visitCountStr = jsonObject.getString("city_recency");
                Double visitCount = Double.parseDouble(visitCountStr);
                if (visitCount > 10) {
                    jsonObject.put("recency_rank", "A");
                    a = 5*0.15;
                } else if (visitCount > 5) {
                    jsonObject.put("recency_rank", "B");
                    a = 4*0.15;
                } else if (visitCount > 3) {
                    jsonObject.put("recency_rank", "C");
                    a = 3*0.15;
                } else if (visitCount > 1) {
                    jsonObject.put("recency_rank", "D");
                    a = 2*0.15;
                } else {
                    jsonObject.put("recency_rank", "E");
                    a = 1*0.15;
                }
            }

            //毕业期望
            for (int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String exceptationStr = jsonObject.getString("city_exceptation");
                Double exceptation = Double.parseDouble(exceptationStr);
                if (exceptation>0.05){
                    jsonObject.put("exceptation_rank","A");
                    b = 5*0.2;
                }else if (exceptation>0.03){
                    jsonObject.put("exceptation_rank","B");
                    b = 4*0.2;
                }else if (exceptation>0.01){
                    jsonObject.put("exceptation_rank","C");
                    b = 3*0.2;
                }else if (exceptation>0.005){
                    jsonObject.put("exceptation_rank","D");
                    b = 2*0.2;
                }else if (exceptation>0){
                    jsonObject.put("exceptation_rank","E");
                    b = 1*0.2;
                }
            }

            //本届签约
            for (int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String signStr = jsonObject.getString("city_sign");
                Integer sign = Integer.parseInt(signStr);
                if (sign>100){
                    jsonObject.put("sign_rank","A");
                    c = 5*0.2;
                }else if (sign>50){
                    jsonObject.put("sign_rank","B");
                    c = 4*0.2;
                }else if (sign>20){
                    jsonObject.put("sign_rank","C");
                    c = 3*0.2;
                }else if (sign>10){
                    jsonObject.put("sign_rank","D");
                    c = 2*0.2;
                }else if (sign>0){
                    jsonObject.put("sign_rank","E");
                    c = 1*0.2;
                }
            }

            //毕业生源
            for(int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String studentfromStr = jsonObject.getString("city_studentFrom");
                int studentfrom = Integer.parseInt(studentfromStr);
                if(studentfrom>100){
                    jsonObject.put("studentFrom_rank", "A");
                    d = 5*0.15;
                }else if(studentfrom>50){
                    jsonObject.put("studentFrom_rank", "B");
                    d = 4*0.15;
                }else if(studentfrom>20){
                    jsonObject.put("studentFrom_rank", "C");
                    d = 3*0.15;
                }else if(studentfrom>10){
                    jsonObject.put("studentFrom_rank", "D");
                    d = 2*0.15;
                }else {
                    jsonObject.put("studentFrom_rank", "E");
                    d = 1*0.15;
                }
            }

            //往届走访
            for(int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String visitStr = jsonObject.getString("city_visit");
                int visit = Integer.parseInt(visitStr);
                if(visit>=4){
                    jsonObject.put("visit_rank", "A");
                    e = 5*0.15;
                }else if(visit>=3){
                    jsonObject.put("visit_rank", "B");
                    e = 4*0.15;
                }else if(visit>=2){
                    jsonObject.put("visit_rank", "C");
                    e = 3*0.15;
                }else if(visit>=1){
                    jsonObject.put("visit_rank", "D");
                    e = 2*0.15;
                }else if(visit>=0){
                    jsonObject.put("visit_rank", "E");
                    e = 1*0.15;
                }
            }

            //城市分级
            for (int i = 0; i < array.size(); i++) {
                JSONObject jsonObject = array.getJSONObject(i);
                String gradingStr = jsonObject.getString("city_grading");
                if (gradingStr.equals("一线城市")){
                    jsonObject.put("grading_rank","A");
                    f = 5*0.15;
                }else if (gradingStr.equals("新一线城市")){
                    jsonObject.put("grading_rank","B");
                    f = 4*0.15;
                }else if (gradingStr.equals("二线城市")){
                    jsonObject.put("grading_rank","C");
                    f = 3*0.15;
                }else if (gradingStr.equals("三线城市")){
                    jsonObject.put("grading_rank","D");
                    f = 2*0.15;
                }else if (gradingStr.equals("四线城市")){
                    jsonObject.put("grading_rank","D");
                    f = 2*0.15;
                }else if (gradingStr.equals("其他情况")){
                    jsonObject.put("grading_rank","E");
                    f = 1*0.15;
                }
            }
            double city_score = a+b+c+d+e+f;
        String list2 = array.toString();
        return list2;
    }

    /**
     * 查询（根据数据分级）
     * @param keyword
     * @return
     */
    @RequestMapping(value = "/queryEducationByKeywordString")
    public String selectEducationByKeywordString(String keyword) throws Exception{
        List<Education> resultList1 = null;
            System.out.println(keyword);
            resultList1 = educationService.queryEducationByKeyword(keyword);
            JSONArray array = JSONArray.parseArray(JSON.toJSONString(resultList1));

            //城市回访
            for(int i=0;i<array.size();i++) {
                JSONObject jsonObject = array.getJSONObject(i);
                String visitCountStr = jsonObject.getString("city_recency");
                Double visitCount = Double.parseDouble(visitCountStr);
                if (visitCount > 10) {
                    jsonObject.put("recency_rank", "A");
                } else if (visitCount > 5) {
                    jsonObject.put("recency_rank", "B");
                } else if (visitCount > 3) {
                    jsonObject.put("recency_rank", "C");
                } else if (visitCount > 1) {
                    jsonObject.put("recency_rank", "D");
                } else {
                    jsonObject.put("recency_rank", "E");
                }
            }

            //毕业期望
            for (int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String exceptationStr = jsonObject.getString("city_exceptation");
                Double exceptation = Double.parseDouble(exceptationStr);
                if (exceptation>0.05){
                    jsonObject.put("exceptation_rank","A");
                }else if (exceptation>0.03){
                    jsonObject.put("exceptation_rank","B");
                }else if (exceptation>0.01){
                    jsonObject.put("exceptation_rank","C");
                }else if (exceptation>0.005){
                    jsonObject.put("exceptation_rank","D");
                }else if (exceptation>0){
                    jsonObject.put("exceptation_rank","E");
                }
            }

            //本届签约
            for (int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String signStr = jsonObject.getString("city_sign");
                Integer sign = Integer.parseInt(signStr);
                if (sign>100){
                    jsonObject.put("sign_rank","A");
                }else if (sign>50){
                    jsonObject.put("sign_rank","B");
                }else if (sign>20){
                    jsonObject.put("sign_rank","C");
                }else if (sign>10){
                    jsonObject.put("sign_rank","D");
                }else if (sign>0){
                    jsonObject.put("sign_rank","E");
                }
            }

            //毕业生源
            for(int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String studentfromStr = jsonObject.getString("city_studentFrom");
                int studentfrom = Integer.parseInt(studentfromStr);
                if(studentfrom>100){
                    jsonObject.put("studentFrom_rank", "A");
                }else if(studentfrom>50){
                    jsonObject.put("studentFrom_rank", "B");
                }else if(studentfrom>20){
                    jsonObject.put("studentFrom_rank", "C");
                }else if(studentfrom>10){
                    jsonObject.put("studentFrom_rank", "D");
                }else {
                    jsonObject.put("studentFrom_rank", "E");
                }
            }

            //往届走访
            for(int i=0;i<array.size();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                String visitStr = jsonObject.getString("city_visit");
                int visit = Integer.parseInt(visitStr);
                if(visit>=4){
                    jsonObject.put("visit_rank", "A");
                }else if(visit>=3){
                    jsonObject.put("visit_rank", "B");
                }else if(visit>=2){
                    jsonObject.put("visit_rank", "C");
                }else if(visit>=1){
                    jsonObject.put("visit_rank", "D");
                }else if(visit>=0){
                    jsonObject.put("visit_rank", "E");
                }
            }

            //城市分级
            for (int i = 0; i < array.size(); i++) {
                JSONObject jsonObject = array.getJSONObject(i);
                String gradingStr = jsonObject.getString("city_grading");
                if (gradingStr.equals("一线城市")){
                    jsonObject.put("grading_rank","A");
                }else if (gradingStr.equals("新一线城市")){
                    jsonObject.put("grading_rank","B");
                }else if (gradingStr.equals("二线城市")){
                    jsonObject.put("grading_rank","C");
                }else if (gradingStr.equals("三线城市")){
                    jsonObject.put("grading_rank","D");
                }else if (gradingStr.equals("四线城市")){
                    jsonObject.put("grading_rank","D");
                }else if (gradingStr.equals("其他情况")){
                    jsonObject.put("grading_rank","E");
                }
            }
            String resultList2 = array.toString();
        return resultList2;
    }

    /**
     * 查询（根据详细数据）
     * @param keyword
     * @param model
     * @return
     */
    @RequestMapping(value = "/queryEducationByKeywordInt")
    public List<Education> selectEducationByKeywordInt(String keyword, Model model){
        List<Education> resultList2 = null;
        try {
            System.out.println(keyword);
            resultList2 = educationService.queryEducationByKeyword(keyword);
            model.addAttribute("resultList",resultList2);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList2;
    }

}
