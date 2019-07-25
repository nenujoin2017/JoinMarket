package com.nenu.market.controller.company;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nenu.market.entity.company.Company;
import com.nenu.market.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kyy
 * @Description:
 * @Date: 15:25 2019/7/24
 */
@CrossOrigin
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "listCompany")
    public String listAllCompany() throws Exception{
        List<Company> list1 = companyService.listAllCompany();
        //所有走访单位信息
        List<Company> list2 = companyService.listVisit();
        //所有来校宣讲单位信息
        List<Company> list3 = companyService.listReturn();
        //所有签约单位信息
        List<Company> list4 = companyService.listSign();
        JSONArray array1 = JSONArray.parseArray(JSON.toJSONString(list1));
        JSONArray array2 = JSONArray.parseArray(JSON.toJSONString(list2));
        JSONArray array3 = JSONArray.parseArray(JSON.toJSONString(list3));
        JSONArray array4 = JSONArray.parseArray(JSON.toJSONString(list4));

        for(int i=0;i<array1.size();i++){
            int visitNumber =0;
            int returnNumber =0;
            int signNumber = 0;
            JSONObject jsonObject1 = array1.getJSONObject(i);
            String company_name = jsonObject1.getString("company_name");
            for(int j=0;j<array2.size();j++){
                JSONObject jsonObject2 = array2.getJSONObject(j);
                String company = jsonObject2.getString("company");
                if(company.equals(company_name)){
                    visitNumber++;
                }
            }
            for(int k=0;k<array3.size();k++){
                JSONObject jsonObject2 = array3.getJSONObject(k);
                String unitName = jsonObject2.getString("unitName");
                if(unitName.equals(company_name)){
                    returnNumber++;
                }
            }
            for(int p=0;p<array4.size();p++){
                JSONObject jsonObject2 = array4.getJSONObject(p);
                String signCompany = jsonObject2.getString("signCompany");
                if(signCompany.equals(company_name)){
                    signNumber++;
                }
            }
            jsonObject1.put("total_visit", visitNumber);
            jsonObject1.put("total_return", returnNumber);
            jsonObject1.put("total_sign", signNumber);
        }
        String list = array1.toString();
        return list;
    }

    @RequestMapping(value = "selectCompany")
    public String selectCompany(String keyword) throws Exception{
        List<Company> list1 = companyService.selectCompany(keyword);
        //所有走访单位信息
        List<Company> list2 = companyService.listVisit();
        //所有来校宣讲单位信息
        List<Company> list3 = companyService.listReturn();
        //所有签约单位信息
        List<Company> list4 = companyService.listSign();
        JSONArray array1 = JSONArray.parseArray(JSON.toJSONString(list1));
        JSONArray array2 = JSONArray.parseArray(JSON.toJSONString(list2));
        JSONArray array3 = JSONArray.parseArray(JSON.toJSONString(list3));
        JSONArray array4 = JSONArray.parseArray(JSON.toJSONString(list4));

        for(int i=0;i<array1.size();i++){
            int visitNumber =0;
            int returnNumber =0;
            int signNumber = 0;
            JSONObject jsonObject1 = array1.getJSONObject(i);
            String company_name = jsonObject1.getString("company_name");
            for(int j=0;j<array2.size();j++){
                JSONObject jsonObject2 = array2.getJSONObject(j);
                String company = jsonObject2.getString("company");
                if(company.equals(company_name)){
                    visitNumber++;
                }
            }
            for(int k=0;k<array3.size();k++){
                JSONObject jsonObject2 = array3.getJSONObject(k);
                String unitName = jsonObject2.getString("unitName");
                if(unitName.equals(company_name)){
                    returnNumber++;
                }
            }
            for(int p=0;p<array4.size();p++){
                JSONObject jsonObject2 = array4.getJSONObject(p);
                String signCompany = jsonObject2.getString("signCompany");
                if(signCompany.equals(company_name)){
                    signNumber++;
                }
            }
            jsonObject1.put("total_visit", visitNumber);
            jsonObject1.put("total_return", returnNumber);
            jsonObject1.put("total_sign", signNumber);
        }
        String list = array1.toString();
        return list;
    }

 }
