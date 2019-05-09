package com.nenu.market.service.city.Impl;


import com.nenu.market.entity.city.Education;
import com.nenu.market.mapper.city.NonEducationMapper;
import com.nenu.market.service.city.NonEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service("NonEducationService")
public class NonEducationServiceImpl implements NonEducationService{

    @Autowired NonEducationMapper nonEducationMapper;

    /**
     * 遍历
     */
    @Override
    @Transactional
    public List<Education> listAll() throws Exception{
        List<Education> nonEducationList = Collections.emptyList();
        try {
            nonEducationList = nonEducationMapper.listAll2();
        }catch (Exception e){
            e.printStackTrace();
        }
        return nonEducationList;
    }



    /**
     * 根据关键字查询
     */
    @Override
    @Transactional
    public List<Education> selectEducationByKeyword(String keyword) throws Exception{
        List<Education> list1 = null;
        try {
            list1 = nonEducationMapper.selectEducationByKeyword(keyword);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list1;
    }


}
