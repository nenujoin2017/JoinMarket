package com.nenu.market.controller.city;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.city.Education;
import com.nenu.market.service.city.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    VisitService visitService;

    /**
     * 遍历
     * @return
     */
    @RequestMapping(value = "/listAllVisit")
    public String visitList() throws Exception{
        List<Education> list = null;
            list = visitService.listAllVisit();
            JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
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
            for (int j=0;j<array.size();j++){
                JSONObject jsonObject = array.getJSONObject(j);
                String education_yonStr = jsonObject.getString("education_yon");
                int educationYon = Integer.parseInt(education_yonStr);
                if (educationYon==1){
                    jsonObject.put("education_type","教育");
                }else {
                    jsonObject.put("education_type","非教育");
                }
            }
            String list2 = array.toString();
        return list2;
    }


    /**
     * 根据是否为教育类/城市名称/权重分析 查询
     * @param education_yon
     * @param city_name
     * @param city_visit
     * @return
     */
    @RequestMapping(value = "/queryVisitByKeyword")
    public String queryVisitByKeyword(String education_yon, String city_name, String city_visit) throws Exception{
        List<Education> list = null;
            list = visitService.queryVisitByKeyword(Integer.parseInt(education_yon),city_name,Integer.parseInt(city_visit));
            JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
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
            for (int j=0;j<array.size();j++){
                JSONObject jsonObject = array.getJSONObject(j);
                String education_yonStr = jsonObject.getString("education_yon");
                int educationYon = Integer.parseInt(education_yonStr);
                if (educationYon==1){
                    jsonObject.put("education_type","教育");
                }else {
                    jsonObject.put("education_type","非教育");
                }
            }
            String list2 = array.toString();
        return list2;
    }
}
