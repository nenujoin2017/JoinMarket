package com.nenu.market.mapper.visitorPosition;

import com.nenu.market.entity.visitorPosition.VisitPosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xinlee dage
 * @Description:
 * @Date: 16:27 2019/5/20
 */
@Mapper
@Repository
public interface VisitPositonMapper {

    List<VisitPosition> listAllVisitPosition();

    boolean addVisitPosition(@Param("VisitPosition") VisitPosition visitPosition);

    boolean updateVisitPosition(@Param("VisitPosition") VisitPosition visitPosition);

    List<VisitPosition> queryVisitPosition(@Param("keyword") String keyword, @Param("year") String year);

    List<VisitPosition> listVisitPosition(@Param("time") String time, @Param("visitor_name") String vistor_name, @Param("company_name") String company_name);
}
