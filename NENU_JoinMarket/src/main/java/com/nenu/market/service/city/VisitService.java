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
     * 根据是否为教育类/城市名称/权重分析 查询
     * @param education
     * @param city_name
     * @param city_visit
     * @return
     * @throws Exception
     */
    public List<Education> queryVisitByKeyword(int education, String city_name, int city_visit) throws Exception;
}
