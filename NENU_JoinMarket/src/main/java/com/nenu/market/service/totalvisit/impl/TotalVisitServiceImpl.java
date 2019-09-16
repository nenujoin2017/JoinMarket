package com.nenu.market.service.totalvisit.impl;

import com.nenu.market.entity.totalvisit.TotalVisit;
import com.nenu.market.mapper.totalvisit.TotalVisitMapper;
import com.nenu.market.service.totalvisit.TotalVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 0:12 2019/5/10
 */
@Service
public class TotalVisitServiceImpl implements TotalVisitService {

    @Autowired
    TotalVisitMapper totalVisitMapper;

    @Override
    public boolean addTotalVisit(TotalVisit totalVisit) throws Exception{
        return totalVisitMapper.addTotalVisit(totalVisit);
    }

    @Override
    public TotalVisit selectByCityName(String city_name) throws Exception{
        return totalVisitMapper.selectByCityName(city_name);
    }

    @Override
    public boolean updateCityReturnCount(TotalVisit totalVisit) throws Exception{
        return totalVisitMapper.updateCityReturnCount(totalVisit);
    }

    @Override
    public boolean updateCityVisitCount(TotalVisit totalVisit) throws Exception{
        return totalVisitMapper.updateCityVisitCount(totalVisit);
    }

    @Override
    public boolean updateSignNumber_b(TotalVisit totalVisit) throws Exception{
        return totalVisitMapper.updateSignNumber_b(totalVisit);
    }

    @Override
    public boolean updateSignNumber_y(TotalVisit totalVisit) throws Exception{
        return totalVisitMapper.updateSignNumber_y(totalVisit);
    }
}
