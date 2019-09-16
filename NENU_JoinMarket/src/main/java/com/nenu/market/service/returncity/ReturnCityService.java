package com.nenu.market.service.returncity;

import com.nenu.market.entity.company.Company;
import com.nenu.market.entity.returncity.ReturnCity;

import java.util.List;

public interface ReturnCityService {

    /**
     * 列出所有城市
     * @return
     * @throws Exception
     */
    public List<ReturnCity> listAllReturnCity() throws Exception;

    /**
     * 查询条件除了城市
     * @return
     * @throws Exception
     */
    public List<ReturnCity> SelectCity1(ReturnCity returnCity) throws Exception;

    /**
     * 包含所有查询条件
     * @return
     * @throws Exception
     */
    public List<ReturnCity> SelectCity2(ReturnCity returnCity) throws Exception;


}
