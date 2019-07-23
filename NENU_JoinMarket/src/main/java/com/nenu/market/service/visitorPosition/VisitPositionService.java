package com.nenu.market.service.visitorPosition;


import com.nenu.market.entity.visitorPosition.VisitPosition;

import java.util.List;

/**
 * @Author: xinlee dage
 * @Description:
 * @Date: 16:51 2019/5/20
 */
public interface VisitPositionService {

    List<VisitPosition> listAllVisitPosition();

    boolean addVisitPosition(VisitPosition visitPosition);

    boolean updateVisitPosition(VisitPosition visitPosition);

    List<VisitPosition> queryVisitPosition(String keyword, String year);

    List<VisitPosition> listVisitPosition(String time, String vistorname, String companyname);

}
