package com.nenu.market.service.position_requirements.impl;//package com.nenu.market.service.position_requirements.impl;

import com.nenu.market.entity.position_requirements.PositionRequirements;
import com.nenu.market.mapper.position_requirements.PositionRequirementsMapper;
import com.nenu.market.service.position_requirements.PositionRequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 21:30 2019/5/16
 */

@Service("PositionRequirementsService")
public class PositionRequirementsServiceImpl implements PositionRequirementsService{

    @Autowired
    PositionRequirementsMapper positionRequirementsMapper;


    /**
     * 增加一条岗位需求信息
     * @param positionRequirements
     * @return
     */
    @Override
    @Transactional
    public PositionRequirements addPositionRequirements(PositionRequirements positionRequirements){
        try {
            positionRequirements = positionRequirementsMapper.addPositionRequirements(positionRequirements);
        }catch (Exception e){
            e.printStackTrace();
        }
        return positionRequirements;
    }


    @Override
    @Transactional
    /**
     * 编辑一条岗位需求信息
     * @param positionRequirements
     * @return
     */
    public PositionRequirements updatePositionRequirements(PositionRequirements positionRequirements){
        try {
            positionRequirements = positionRequirementsMapper.updatePositionRequirements(positionRequirements);
        }catch (Exception e){
            e.printStackTrace();
        }
        return positionRequirements;
    }


    @Override
    @Transactional
    /**
     * 根据关键字查询一条岗位需求信息
     * @param keyword
     * @return
     */
    public List<PositionRequirements> queryPositionRequirementsByKeyword(String keyword){
        List<PositionRequirements> resultList = Collections.emptyList();
        try {
            resultList = positionRequirementsMapper.queryPositionRequirementsByKeyword(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList;
    }


    @Override
    @Transactional
    /**
     * 遍历所有岗位需求信息
     * @return
     */
    public List<PositionRequirements> listAllPositionRequirements(){
        List<PositionRequirements> list = Collections.emptyList();
        try {
            list = positionRequirementsMapper.listAllPositionRequirements();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
