package com.nenu.market.controller.studentFrom;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.studentFrom.StudentFrom;
import com.nenu.market.service.studentfrom.StudentFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2019/5/9 12:21
 */
@CrossOrigin
@RestController
@RequestMapping("/studentFrom")
public class StudentFromController {

    @Autowired
    StudentFromService studentFromService;

    @RequestMapping(value = "studentFromList")
    public String listAll() throws Exception{
        List<StudentFrom> list = Collections.emptyList();
        list = studentFromService.listStudentFrom();
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
        double s = 0;
        for(int i=0 ; i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String studentfromstr = jsonObject.getString("city_studentFrom");
            int studentfrom = Integer.parseInt(studentfromstr);
            s = s + studentfrom;
        }
        for(int i=0;i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String studentfromstr = jsonObject.getString("city_studentFrom");
            int studentfrom = Integer.parseInt(studentfromstr);
            Double student_rate = studentfrom/s;
            student_rate *= 100;
            String student_ratestr = String.valueOf(student_rate);
            student_ratestr += "%";
            System.out.println(student_ratestr);
            jsonObject.put("student_rate", student_ratestr);
            if(studentfrom>100){
                jsonObject.put("student_rank", "A");
            }else if(studentfrom>50){
                jsonObject.put("student_rank", "B");
            }else if(studentfrom>20){
                jsonObject.put("student_rank", "C");
            }else if(studentfrom>10){
                jsonObject.put("student_rank", "D");
            }else {
                jsonObject.put("student_rank", "E");
            }
        }
        System.out.println(s);
        String list2 = array.toString();
        return list2;
    }

    @RequestMapping(value = "select")
    public String selectStudentFromCity(String education, String Syear, String city_name,String count) throws Exception{
        List<StudentFrom> list1 = Collections.emptyList();
        StudentFrom studentFrom = new StudentFrom();
        int education_yon = 1;
        if(education == "教育"){
            education_yon = 1;
        }
        if(education == "非教育"){
            education_yon = 0;
        }
        int year = Integer.parseInt(Syear);
        if(city_name == "" && count=="生源人数"){
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setCity_year(year);
            list1 = studentFromService.Select4(studentFrom);
        }
        if(count == "生源人数" && city_name == ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setCity_name(city_name);
            list1 = studentFromService.Select1(studentFrom);
        }
        if(count == "100以上" && city_name == ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(100);
            studentFrom.setMax(1000);
            list1 = studentFromService.Select2(studentFrom);
        }
        if(count == "50-100" && city_name == ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(50);
            studentFrom.setMax(100);
            list1 = studentFromService.Select2(studentFrom);
        }
        if(count == "20-50" && city_name == ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(20);
            studentFrom.setMax(50);
            list1 = studentFromService.Select2(studentFrom);
        }
        if(count == "10-20" && city_name == ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(10);
            studentFrom.setMax(20);
            list1 = studentFromService.Select2(studentFrom);
        }
        if(count == "10以下" && city_name == ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(0);
            studentFrom.setMax(10);
            list1 = studentFromService.Select2(studentFrom);
        }
        if(count == "100以上" && city_name != ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(100);
            studentFrom.setMax(1000);
            list1 = studentFromService.Select3(studentFrom);
        }
        if(count == "50-100" && city_name != ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(50);
            studentFrom.setMax(100);
            list1 = studentFromService.Select3(studentFrom);
        }
        if(count == "20-50" && city_name != ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(20);
            studentFrom.setMax(50);
            list1 = studentFromService.Select3(studentFrom);
        }
        if(count == "10-20" && city_name != ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(10);
            studentFrom.setMax(20);
            list1 = studentFromService.Select3(studentFrom);
        }
        if(count == "10以下" && city_name != ""){
            studentFrom.setCity_year(year);
            studentFrom.setEducation_yon(education_yon);
            studentFrom.setMin(0);
            studentFrom.setMax(10);
            list1 = studentFromService.Select3(studentFrom);
        }
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list1));
        double s = 0;
        for(int i=0 ; i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String studentfromstr = jsonObject.getString("city_studentFrom");
            int studentfrom = Integer.parseInt(studentfromstr);
            s = s + studentfrom;
        }
        for(int i=0;i<array.size();i++){
            JSONObject jsonObject = array.getJSONObject(i);
            String studentfromstr = jsonObject.getString("city_studentFrom");
            int studentfrom = Integer.parseInt(studentfromstr);
            Double student_rate = studentfrom/s;
            student_rate *= 100;
            String student_ratestr = String.valueOf(student_rate);
            student_ratestr += "%";
            System.out.println(student_ratestr);
            jsonObject.put("student_rate", student_ratestr);
            if(studentfrom>100){
                jsonObject.put("student_rank", "A");
            }else if(studentfrom>50){
                jsonObject.put("student_rank", "B");
            }else if(studentfrom>20){
                jsonObject.put("student_rank", "C");
            }else if(studentfrom>10){
                jsonObject.put("student_rank", "D");
            }else {
                jsonObject.put("student_rank", "E");
            }
        }
        System.out.println(s);
        String list2 = array.toString();
        return list2;

    }
}
