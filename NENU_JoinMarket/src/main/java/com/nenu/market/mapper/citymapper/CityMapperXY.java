package com.nenu.market.mapper.citymapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityMapperXY {

    List getCityExByYear(@Param("year") int year);

    List getCitySignByYear(int year);

}
