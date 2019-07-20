package com.nenu.market.mapper.participation_intention;

import com.nenu.market.entity.participation_intention.ParticipationIntention;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Liang Jiayue
 * @Description:参会意向的CRUD
 * @Date: 16:26 2019/5/17
 */

@Mapper
@Repository
public interface ParticipationIntentionMapper {

    /**
     * 增加参会意向
     * @param participationIntention
     * @return
     */
    public ParticipationIntention addParticipationIntention(ParticipationIntention participationIntention);


//    /**
//     * 编辑参会意向
//     * @param participationIntention
//     * @return
//     */
//    public ParticipationIntention updateParticipationIntention(ParticipationIntention participationIntention);
//
//
//    /**
//     * 根据关键字查询参会意向
//     * @param keyword
//     * @return
//     */
//    public List<ParticipationIntention> queryParticipationIntention(String keyword);


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
    public List<ParticipationIntention> listByCVT(@Param("company_name") String company_name, @Param("visitor_name") String visitor_name, @Param("time") String time);
}
