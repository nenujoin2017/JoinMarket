package com.nenu.market.service.city.impl;

import com.nenu.market.entity.city.Education;
import com.nenu.market.mapper.city.VisitMapper;
import com.nenu.market.service.city.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service("VisitService")
public class VisitServiceImpl implements VisitService {

    @Autowired
    VisitMapper visitMapper;

    /**
     * 遍历
     */
    @Override
    @Transactional
    public List<Education> listAllVisit() throws Exception {
        List<Education> visitList = Collections.emptyList();
        try {
            visitList = visitMapper.listAllVisit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visitList;
    }

    /**
     * 根据是否为教育类/城市名称/权重分析 查询
     *
     * @param education_yon
     * @param city_name
     * @param city_visit
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public List<Education> queryVisitByKeyword(int education_yon, String city_name, int city_visit) throws Exception {
        List<Education> visitList = null;
        try {
            visitList = visitMapper.queryVisitByKeyword(education_yon, city_name, city_visit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visitList;
    }
}
