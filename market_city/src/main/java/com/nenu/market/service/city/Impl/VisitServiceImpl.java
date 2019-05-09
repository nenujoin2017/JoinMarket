package com.nenu.market.service.city.Impl;

import com.nenu.market.entity.city.Education;
import com.nenu.market.mapper.city.VisitMapper;
import com.nenu.market.service.city.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("VisitService")
public class VisitServiceImpl implements VisitService{

    @Autowired VisitMapper visitMapper;

    /**
     * 遍历
     */
    @Override
    @Transactional
    public List<Education> listAll1() throws Exception{
        List<Education> visitList = null;
        try {
            visitList = visitMapper.listAll1();
        }catch (Exception e){
            e.printStackTrace();
        }
        return visitList;
    }

    /**
     * 根据教育类或非教育类查询
     */
    @Override
    @Transactional
    public List<Education> selectByEducationYon(String education_yon) throws Exception{
        List<Education> visitList1 = null;
        try {
            visitList1 = visitMapper.selectByEducationYon(education_yon);
        }catch (Exception e){
            e.printStackTrace();
        }
        return visitList1;
    }

    /**
     * 根据城市名查询
     */
    @Override
    @Transactional
    public List<Education> selectByCityName(String city_name) throws Exception{
        List<Education> visitList2 = null;
        try {
            visitList2 = visitMapper.selectByCityName(city_name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return visitList2;

    }
}
