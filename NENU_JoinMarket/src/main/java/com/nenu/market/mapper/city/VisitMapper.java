package com.nenu.market.mapper.city;

/**
 * @Author:Liang Jiayue
 * @Description:往届走访的遍历和查询
 * @Date: 0:01 2019/5/7
 */

import com.nenu.market.entity.city.Education;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VisitMapper {

    /**
     * 遍历
     */
    public List<Education> listAllVisit() throws Exception;

//    /**
//     * 根据教育类还是非教育类查询
//     */
//    public List<Education> selectByEducationYon(String education_yon) throws Exception;
//
//    /**
//     * 根据城市名查询
//     */
//    public List<Education> selectByCityName(String city_name) throws Exception;


    /**
     * 根据是否为教育类/城市名称/权重分析 查询
     * @param education_yon
     * @param city_name
     * @param city_visit
     * @return
     * @throws Exception
     */
    public List<Education> queryVisitByKeyword(@Param("education_yon") int education_yon, @Param("city_name") String city_name, @Param("city_visit") int city_visit) throws Exception;
}
