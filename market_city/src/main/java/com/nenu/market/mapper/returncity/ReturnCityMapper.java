package com.nenu.market.mapper.returncity;

import com.nenu.market.entity.returncity.ReturnCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReturnCityMapper {

    /**
     * list方法
     * @return
     * @throws Exception
     */
    public List<ReturnCity> listAllReturnCity() throws Exception;

    /**
     * 查询条件除了城市
     * @return
     * @throws Exception
     */
    public List<ReturnCity> SelectCity1(@Param("returnCity")ReturnCity returnCity) throws Exception;

    /**
     * 包含所有查询条件
     * @return
     * @throws Exception
     */
    public List<ReturnCity> SelectCity2(@Param("returnCity")ReturnCity returnCity);
}
