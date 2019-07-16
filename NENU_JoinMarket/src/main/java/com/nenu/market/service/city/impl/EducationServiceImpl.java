package com.nenu.market.service.city.impl;

import com.nenu.market.entity.city.Education;
import com.nenu.market.mapper.city.EducationMapper;
import com.nenu.market.service.city.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service("EducationService")

public class EducationServiceImpl implements EducationService{

    @Autowired EducationMapper educationMapper;

    /**
     * 遍历
     */
    @Override
    @Transactional
    public List<Education> listAllEducation() throws Exception{
        List<Education> educationList = Collections.emptyList();
        try {
            educationList = educationMapper.listAllEducation();
        }catch (Exception e){
            e.printStackTrace();
        }
        return educationList;
    }



    /**
     * 根据关键字查询
     */
    @Override
    @Transactional
    public List<Education> queryEducationByKeyword(String keyword) throws Exception{
        List<Education> list = null;
        try {
            list = educationMapper.queryEducationByKeyword(keyword);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


}
