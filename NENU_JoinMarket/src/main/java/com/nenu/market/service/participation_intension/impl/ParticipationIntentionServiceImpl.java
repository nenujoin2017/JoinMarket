package com.nenu.market.service.participation_intension.impl;

import com.nenu.market.entity.participation_intention.ParticipationIntention;
import com.nenu.market.mapper.participation_intention.ParticipationIntentionMapper;
import com.nenu.market.service.participation_intension.ParticipationIntentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 16:32 2019/5/17
 */

@Service("ParticipationIntentionService")
public class ParticipationIntentionServiceImpl implements ParticipationIntentionService{

    @Autowired
    ParticipationIntentionMapper participationIntentionMapper;



    /**
     * 增加参会意向
     * @param participationIntention
     * @return
     */
    @Override
    @Transactional
    public ParticipationIntention addParticipationIntention(ParticipationIntention participationIntention){
        try {
            participationIntention = participationIntentionMapper.addParticipationIntention(participationIntention);
        }catch (Exception e){
            e.printStackTrace();
        }
        return participationIntention;
    }


    @Override
    @Transactional
    /**
     * 编辑参会意向
     * @param participationIntention
     * @return
     */
    public ParticipationIntention updateParticipationIntention(ParticipationIntention participationIntention){
        try{
            participationIntention = participationIntentionMapper.updateParticipationIntention(participationIntention);
        }catch (Exception e){
            e.printStackTrace();
        }
        return participationIntention;
    }


    @Override
    @Transactional
    /**
     * 根据关键字查询参会意向
     * @param keyword
     * @return
     */
    public List<ParticipationIntention> queryParticipationIntention(String keyword){
        List<ParticipationIntention> resultList = Collections.emptyList();
        try {
            resultList = participationIntentionMapper.queryParticipationIntention(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList;
    }


    @Override
    @Transactional
    /**
     * 遍历参会意向
     * @return
     */
    public List<ParticipationIntention> listAllParticipationIntention(){
        List<ParticipationIntention> list = Collections.emptyList();
        try {
            list = participationIntentionMapper.listAllParticipationIntention();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
