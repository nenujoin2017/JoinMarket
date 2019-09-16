package com.nenu.market.service.schoolFellow.impl;

import com.nenu.market.entity.schoolFellow.SchoolFellow;
import com.nenu.market.mapper.schoolFellow.SchoolFellowMapper;
import com.nenu.market.service.schoolFellow.SchoolFellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy dage
 * @time : 2019/5/16 8:24
 */
@Service
public class SchoolFellowServiceImpl implements SchoolFellowService {

    @Autowired
    SchoolFellowMapper schoolFellowMapper;

    @Override
    public boolean addSchoolFellow(SchoolFellow schoolFellow) throws Exception{
        return schoolFellowMapper.addSchoolFellow(schoolFellow);
    }

    @Override
    public boolean updateSchoolFellow(SchoolFellow schoolFellow) throws Exception{
        return schoolFellowMapper.updateSchoolFellow(schoolFellow);
    }

    @Override
    public List<SchoolFellow> listSchoolFellow(String company_name, String visitor_name, String visitor_time) throws Exception{
        List<SchoolFellow> schoolFellowList = Collections.emptyList();
        schoolFellowList = schoolFellowMapper.listSchoolFellow(company_name, visitor_name,visitor_time);
        return schoolFellowList;
    }

    @Override
    public List<SchoolFellow> querySchoolFellow(String keyword,String year) throws Exception{
        List<SchoolFellow> schoolFellowList = Collections.emptyList();
        schoolFellowList = schoolFellowMapper.querySchoolFellow(keyword,year);
        return schoolFellowList;
    }
}
