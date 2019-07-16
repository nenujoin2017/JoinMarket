package com.nenu.market.service.city;

import com.nenu.market.entity.city.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VisitService {
    /**
     * 遍历
     */
    public List<Education> listAllVisit() throws Exception;

//    /**
//     * 根据教育类或非教育类查询
//     */
//    public List<Education> selectByEducationYon(String education_yon) throws Exception;
//
//    /**
//     * 根据城市名查询
//     */
//    public List<Education> selectByCityName(String city_name) throws Exception;

    /**
     * 根据关键字查询
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Education> queryVisitByKeyword(String keyword) throws Exception;
}
