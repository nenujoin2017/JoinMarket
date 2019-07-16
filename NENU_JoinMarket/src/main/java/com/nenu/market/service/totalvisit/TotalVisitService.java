package com.nenu.market.service.totalvisit;


import com.nenu.market.entity.totalvisit.TotalVisit;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 0:12 2019/5/10
 */
public interface TotalVisitService {

    public boolean addTotalVisit(TotalVisit totalVisit) throws Exception;

    public TotalVisit selectByCityName(String city_name) throws Exception;

    public boolean updateCityReturnCount(TotalVisit totalVisit) throws Exception;

    public boolean updateCityVisitCount(TotalVisit totalVisit) throws Exception;

}
