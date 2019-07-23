package com.nenu.market.service.visitor.impl;

import com.nenu.market.entity.visitor.Visitor;
import com.nenu.market.mapper.visitor.VisitorMapper;
import com.nenu.market.service.visitor.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author: CaiyuHan
 * @Description: DAGE
 * @Date: 17:45 2019/5/16
 */

@Service("VisitorService")
public class VisitorServiceImpl implements VisitorService {
    @Autowired
    VisitorMapper visitorMapper;

    @Override
    public List<Visitor> listAllVisitor() {
        List<Visitor> visitorList = Collections.emptyList();
        visitorList = visitorMapper.listAllVisitor();
        return visitorList;
    }

    @Override
    public void addVisitor(Visitor visitor) {
        visitorMapper.addVisitor(visitor);
    }

    @Override
    public void updateVisitor(Visitor visitor) {
        visitorMapper.updateVisitor(visitor);
    }

    @Override
    public Visitor queryVisitorByCompanyNameAndVisitorName(String company_name, String visitor_name, String time) {
        return visitorMapper.queryVisitorByCompanyNameAndVisitorName(company_name,visitor_name,time);
    }

    @Override
    public List<Visitor> queryVisitor(String keyword, String year){
        List<Visitor> visitorList = Collections.emptyList();
        visitorList = visitorMapper.queryVisitor(keyword, year);
        return visitorList;
    }
}
