package com.nenu.market.service.city;


import com.nenu.market.entity.city.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NonEducationService {
    /**
     * 遍历
     */
    public List<Education> listAllNonEducation() throws Exception;


    /**
     *根据关键字查询
     */
    public List<Education> queryNonEducationByKeyword(String keyword) throws Exception;
}
