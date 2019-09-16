package com.nenu.market.controller.studentFrom;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.studentFrom.StudentFrom;
import com.nenu.market.service.studentfrom.StudentFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
    public String selectStudentFromCity(String education, String Syear, String city_name) throws Exception{
        city_name = "%" + city_name + "%";
        System.out.println(education);
        System.out.println(Syear);
        System.out.println(city_name);
        List<StudentFrom> list1 = Collections.emptyList();
        List<StudentFrom> list = studentFromService.listStudentFrom();
        int year = Integer.parseInt(Syear);
        int education_yon = 1;
        if(education.equals("非教育类")){
            education_yon = 0;
        }
        StudentFrom studentFrom = new StudentFrom();
        studentFrom.setCity_year(year);
        studentFrom.setEducation_yon(education_yon);
        studentFrom.setCity_name(city_name);
        System.out.println(studentFrom.getEducation_yon());
        if(city_name.equals("%%")){
            list1 = studentFromService.Select4(studentFrom);
        }else{
            list1 = studentFromService.Select1(studentFrom);
        }
        JSONArray array1 = JSONArray.parseArray(JSON.toJSONString(list));
        double s = 0;
        for(int i=0 ; i<array1.size();i++){
            JSONObject jsonObject1 = array1.getJSONObject(i);
            String studentfromstr = jsonObject1.getString("city_studentFrom");
            int studentfrom = Integer.parseInt(studentfromstr);
            s = s + studentfrom;
        }
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list1));
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
        String list2 = array.toString();
        return list2;
    }
}
