package com.nenu.market.mapper.citylevel;

import com.nenu.market.entity.citylevel.CityLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityLevelMapper {

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
    public void addCityLevel(@Param("CityLevel") CityLevel cityLevel) throws Exception;

    /**
     * 删除城市分级
     * @param id
     * @return
     * @throws Exception
     */
    public boolean deleteCityLevel(@Param("id") int id) throws Exception;

    /**
     * 修改城市分级
     * @param cityLevel
     * @throws Exception
     */
    public void updateCityLevel(@Param("CityLevel") CityLevel cityLevel) throws Exception;

    /**
     * 根据id搜索城市分级
     * @param id
     * @return
     * @throws Exception
     */
    public CityLevel searchCityLevelById(@Param("id") int id) throws Exception;

    /**
     * 关键字搜索城市分级
     * @param key
     * @return
     * @throws Exception
     */
    public List<CityLevel> searchCityLevel(@Param("key") String key) throws Exception;
}
