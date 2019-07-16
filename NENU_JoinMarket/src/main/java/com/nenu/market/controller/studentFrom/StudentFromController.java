package com.nenu.market.controller.studentFrom;

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
    public List<StudentFrom> listAll(Model model){
        List<StudentFrom> list = Collections.emptyList();
        try{
            list = studentFromService.listStudentFrom();
            model.addAttribute("listAll", list);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "select")
    public List<StudentFrom> selectStudentFromCity(Model model, String education, String Syear, String city_name,String count ){
        List<StudentFrom> list1 = Collections.emptyList();
        StudentFrom studentFrom = new StudentFrom();
        int education_yon = 1;
        try{
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
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "生源人数" && city_name == ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setCity_name(city_name);
                list1 = studentFromService.Select1(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "100以上" && city_name == ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(100);
                studentFrom.setMax(1000);
                list1 = studentFromService.Select2(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "50-100" && city_name == ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(50);
                studentFrom.setMax(100);
                list1 = studentFromService.Select2(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "20-50" && city_name == ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(20);
                studentFrom.setMax(50);
                list1 = studentFromService.Select2(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "10-20" && city_name == ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(10);
                studentFrom.setMax(20);
                list1 = studentFromService.Select2(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "10以下" && city_name == ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(0);
                studentFrom.setMax(10);
                list1 = studentFromService.Select2(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "100以上" && city_name != ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(100);
                studentFrom.setMax(1000);
                list1 = studentFromService.Select3(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "50-100" && city_name != ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(50);
                studentFrom.setMax(100);
                list1 = studentFromService.Select3(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "20-50" && city_name != ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(20);
                studentFrom.setMax(50);
                list1 = studentFromService.Select3(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "10-20" && city_name != ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(10);
                studentFrom.setMax(20);
                list1 = studentFromService.Select3(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
            if(count == "10以下" && city_name != ""){
                studentFrom.setCity_year(year);
                studentFrom.setEducation_yon(education_yon);
                studentFrom.setMin(0);
                studentFrom.setMax(10);
                list1 = studentFromService.Select3(studentFrom);
                model.addAttribute("selectStudentFromCity", list1);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list1;
    }
}
