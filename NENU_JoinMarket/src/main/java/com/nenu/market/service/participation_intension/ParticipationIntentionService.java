package com.nenu.market.service.participation_intension;

import com.nenu.market.entity.participation_intention.ParticipationIntention;
import com.nenu.market.mapper.participation_intention.ParticipationIntentionMapper;

import java.util.List;

/**
 * @Author: Liang Jiayue dage
 * @Description:
 * @Date: 16:31 2019/5/17
 */
public interface ParticipationIntentionService {

    /**
     * 增加参会意向
     * @param participationIntention
     * @return
     */
    public ParticipationIntention addParticipationIntention(ParticipationIntention participationIntention);


    /**
     * 编辑参会意向
     * @param participationIntention
     * @return
     */
    public ParticipationIntention updateParticipationIntention(ParticipationIntention participationIntention);


    /**
     * 根据年份和关键字查询参会意向
     * @param keyword
     * @return
     */
    public List<ParticipationIntention> queryParticipationIntention(String keyword,int year);


    /**
     * 遍历参会意向
     * @return
     */
    public List<ParticipationIntention> listAllParticipationIntention();

    /**
     * 根据单位名称、走访人员、时间查询
     * @param company_name
     * @param visitor_name
     * @param time
     * @return
     */
    public ParticipationIntention listByCVT(String company_name,String visitor_name,String time);
}

