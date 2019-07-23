package com.nenu.market.service.visitorPosition.impl;

import com.nenu.market.entity.visitorPosition.VisitPosition;
import com.nenu.market.mapper.visitorPosition.VisitPositonMapper;
import com.nenu.market.service.visitorPosition.VisitPositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @Author: xinlee dage
 * @Description:
 * @Date: 16:52 2019/5/20
 */
@Service("visitPositionService")
public class VisitPositionServiceImpl implements VisitPositionService {
    @Resource
    VisitPositonMapper visitPositonMapper;
    @Override
    public List<VisitPosition> listAllVisitPosition() {
        List<VisitPosition> list=null;
        list=visitPositonMapper.listAllVisitPosition();
        return list;
    }

    @Override
    public boolean addVisitPosition(VisitPosition visitPosition) {
        boolean flag=false;
        flag=visitPositonMapper.addVisitPosition(visitPosition);
        return flag;
    }

    @Override
    public boolean updateVisitPosition(VisitPosition visitPosition) {
        boolean flag=false;
        flag=visitPositonMapper.updateVisitPosition(visitPosition);
        return flag;
    }

    @Override
    public List<VisitPosition> queryVisitPosition(String keyword, String year){
        List<VisitPosition> list=null;
        list=visitPositonMapper.queryVisitPosition(keyword, year);
        return list;
    }

    @Override
    public List<VisitPosition> listVisitPosition(String time, String vistorname, String companyname) {
        List<VisitPosition> list= Collections.emptyList();
        list=visitPositonMapper.listVisitPosition(time,vistorname,companyname);
        return list;
    }
}
