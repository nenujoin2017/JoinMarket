package com.nenu.market.service.citylevel;

import com.nenu.market.entity.citylevel.CityLevel;

import java.util.List;

public interface CityLevelService {
    /**
     * 列出所有城市分级
     * @return
     * @throws Exception
     */
    public List<CityLevel> listAllCityLevel() throws Exception;

    /**
     * 增加城市分级
     * @param cityLevel
     * @throws Exception
     */
    public void addCityLevel(CityLevel cityLevel) throws Exception;

    /**
     * 删除城市分级
     * @param id
     * @return
     * @throws Exception
     */
    public boolean deleteCityLevel(int id) throws Exception;

    /**
     * 修改城市分级
     * @param cityLevel
     * @throws Exception
     */
    public void updateCityLevel(CityLevel cityLevel) throws Exception;

    /**
     * 根据id搜索城市分级
     * @param id
     * @return
     * @throws Exception
     */
    public CityLevel searchCityLevelById(int id) throws Exception;

    /**
     * 根据关键字搜索城市分级
     * @param key
     * @return
     * @throws Exception
     */
    public List<CityLevel> searchCityLevel(String key) throws Exception;
}
