package com.nenu.market.service.city;

import com.nenu.market.entity.city.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VisitService {
    /**
     * 遍历
     */
    public List<Education> listAll1() throws Exception;

    /**
     * 根据教育类或非教育类查询
     */
    public List<Education> selectByEducationYon(String education_yon) throws Exception;

    /**
     * 根据城市名查询
     */
    public List<Education> selectByCityName(String city_name) throws Exception;
}
