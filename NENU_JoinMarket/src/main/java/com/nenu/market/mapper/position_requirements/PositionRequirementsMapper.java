package com.nenu.market.mapper.position_requirements;

import com.nenu.market.entity.position_requirements.PositionRequirements;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description: 岗位需求的CRUD
 * @Date: 21:20 2019/5/16
 */

@Mapper
@Repository
public interface PositionRequirementsMapper {


    /**
     * 增加一条岗位需求信息
     * @param positionRequirements
     * @return
     */
    public PositionRequirements addPositionRequirements(PositionRequirements positionRequirements);


//    /**
//     * 编辑一条岗位需求信息
//     * @param positionRequirements
//     * @return
//     */
//    public PositionRequirements updatePositionRequirements(PositionRequirements positionRequirements);
//
//
//    /**
//     * 根据关键字查询一条岗位需求信息
//     * @param keyword
//     * @return
//     */
//    public List<PositionRequirements> queryPositionRequirementsByKeyword(String keyword);


    /**
     * 遍历所有岗位需求信息
     * @return
     */
    public List<PositionRequirements> listAllPositionRequirements();

    /**
     * 根据单位名称、走访人员、时间查询
     * @param company_name
     * @param visitor_name
     * @param time
     * @return
     */
    public List<PositionRequirements> listPositionRequirementsByCVT(@Param("company_name") String company_name, @Param("visitor_name") String visitor_name, @Param("time") String time);
}
