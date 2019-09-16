package com.nenu.market.service.schoolFellow;


import com.nenu.market.entity.schoolFellow.SchoolFellow;

import java.util.List;

/**
 * @author : kongyy dage
 * @time : 2019/5/16 8:24
 */
public interface SchoolFellowService {

    public boolean addSchoolFellow(SchoolFellow schoolFellow) throws Exception;

    public boolean updateSchoolFellow(SchoolFellow schoolFellow) throws Exception;

    public List<SchoolFellow> listSchoolFellow(String compamy_name, String visitor_name, String visitor_time) throws Exception;

    public List<SchoolFellow> querySchoolFellow(String keyword,String year) throws Exception;
}
