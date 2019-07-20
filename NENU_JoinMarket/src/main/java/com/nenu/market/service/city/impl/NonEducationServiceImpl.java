package com.nenu.market.service.city.impl;


import com.nenu.market.entity.city.Education;
import com.nenu.market.mapper.city.NonEducationMapper;
import com.nenu.market.service.city.NonEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service("NonEducationService")
public class NonEducationServiceImpl implements NonEducationService {

    @Autowired
    NonEducationMapper nonEducationMapper;

    /**
     * 遍历
     */
    @Override
    @Transactional
    public List<Education> listAllNonEducation() throws Exception{
        List<Education> nonEducationList = Collections.emptyList();
            nonEducationList = nonEducationMapper.listAllNonEducation();
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int j = 0; j < nonEducationList.size(); j++) {
            //城市回访
            for (int i = 0; i < nonEducationList.size(); i++) {
                if (nonEducationList.get(i).getCity_recency() > 10) {
                    a = 5 * 0.15;
                } else if (nonEducationList.get(i).getCity_recency() > 5) {
                    a = 4 * 0.15;
                } else if (nonEducationList.get(i).getCity_recency() > 3) {
                    a = 3 * 0.15;
                } else if (nonEducationList.get(i).getCity_recency() > 1) {
                    a = 2 * 0.15;
                } else if (nonEducationList.get(i).getCity_recency() > 0) {
                    a = 1 * 0.15;
                }
            }


            //毕业期望
            for (int i = 0; i < nonEducationList.size(); i++) {
                if (nonEducationList.get(i).getCity_exceptation() > 0.05) {
                    b = 5 * 0.2;
                } else if (nonEducationList.get(i).getCity_exceptation() > 0.03) {
                    b = 4 * 0.2;
                } else if (nonEducationList.get(i).getCity_exceptation() > 0.01) {
                    b = 3 * 0.2;
                } else if (nonEducationList.get(i).getCity_exceptation() > 0.005) {
                    b = 2 * 0.2;
                } else if (nonEducationList.get(i).getCity_exceptation() > 0) {
                    b = 1 * 0.2;
                }
            }


            //本届签约
            for (int i = 0; i < nonEducationList.size(); i++) {
                if (nonEducationList.get(i).getCity_sign() > 100) {
                    c = 5 * 0.2;
                } else if (nonEducationList.get(i).getCity_sign() > 50) {
                    c = 4 * 0.2;
                } else if (nonEducationList.get(i).getCity_sign() > 20) {
                    c = 3 * 0.2;
                } else if (nonEducationList.get(i).getCity_sign() > 10) {
                    c = 2 * 0.2;
                } else if (nonEducationList.get(i).getCity_sign() > 0) {
                    c = 1 * 0.2;
                }
            }


            //毕业生源
            for (int i = 0; i < nonEducationList.size(); i++) {
                if (nonEducationList.get(i).getCity_studentFrom() > 100) {
                    d = 5 * 0.15;
                } else if (nonEducationList.get(i).getCity_studentFrom() > 50) {
                    d = 4 * 0.15;
                } else if (nonEducationList.get(i).getCity_studentFrom() > 20) {
                    d = 3 * 0.15;
                } else if (nonEducationList.get(i).getCity_studentFrom() > 10) {
                    d = 2 * 0.15;
                } else if (nonEducationList.get(i).getCity_studentFrom() > 0) {
                    d = 1 * 0.15;
                }
            }


            //往届走访
            for (int i = 0; i < nonEducationList.size(); i++) {
                if (nonEducationList.get(i).getCity_visit() >= 4) {
                    e = 5 * 0.15;
                } else if (nonEducationList.get(i).getCity_visit() >= 3) {
                    e = 4 * 0.15;
                } else if (nonEducationList.get(i).getCity_visit() >= 2) {
                    e = 3 * 0.15;
                } else if (nonEducationList.get(i).getCity_visit() >= 1) {
                    e = 2 * 0.15;
                } else if (nonEducationList.get(i).getCity_visit() >= 0) {
                    e = 1 * 0.15;
                }
            }


            //城市分级
            for (int i = 0; i < nonEducationList.size(); i++) {
                if (nonEducationList.get(i).getCity_grading().equals("一线城市")) {
                    f = 5 * 0.15;
                } else if (nonEducationList.get(i).getCity_grading().equals("新一线城市")) {
                    f = 4 * 0.15;
                } else if (nonEducationList.get(i).getCity_grading().equals("二线城市")) {
                    f = 3 * 0.15;
                } else if (nonEducationList.get(i).getCity_grading().equals("三线城市")) {
                    f = 2 * 0.15;
                } else if (nonEducationList.get(i).getCity_grading().equals("四线城市")) {
                    f = 2 * 0.15;
                } else if (nonEducationList.get(i).getCity_grading().equals("其他情况")) {
                    f = 1 * 0.15;
                }
            }
            nonEducationList.get(j).setCity_score(a + b + c + d + e + f);
        }
        return nonEducationList;
    }



    /**
     * 根据关键字查询
     */
    @Override
    @Transactional
    public List<Education> queryNonEducationByKeyword(String keyword) throws Exception{
        List<Education> list = null;
            list = nonEducationMapper.queryNonEducationByKeyword(keyword);
            System.out.println(keyword);
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int j = 0; j < list.size(); j++) {
            //城市回访
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity_recency() > 10) {
                    a = 5 * 0.15;
                } else if (list.get(i).getCity_recency() > 5) {
                    a = 4 * 0.15;
                } else if (list.get(i).getCity_recency() > 3) {
                    a = 3 * 0.15;
                } else if (list.get(i).getCity_recency() > 1) {
                    a = 2 * 0.15;
                } else if (list.get(i).getCity_recency() > 0) {
                    a = 1 * 0.15;
                }
            }


            //毕业期望
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity_exceptation() > 0.05) {
                    b = 5 * 0.2;
                } else if (list.get(i).getCity_exceptation() > 0.03) {
                    b = 4 * 0.2;
                } else if (list.get(i).getCity_exceptation() > 0.01) {
                    b = 3 * 0.2;
                } else if (list.get(i).getCity_exceptation() > 0.005) {
                    b = 2 * 0.2;
                } else if (list.get(i).getCity_exceptation() > 0) {
                    b = 1 * 0.2;
                }
            }


            //本届签约
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity_sign() > 100) {
                    c = 5 * 0.2;
                } else if (list.get(i).getCity_sign() > 50) {
                    c = 4 * 0.2;
                } else if (list.get(i).getCity_sign() > 20) {
                    c = 3 * 0.2;
                } else if (list.get(i).getCity_sign() > 10) {
                    c = 2 * 0.2;
                } else if (list.get(i).getCity_sign() > 0) {
                    c = 1 * 0.2;
                }
            }


            //毕业生源
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity_studentFrom() > 100) {
                    d = 5 * 0.15;
                } else if (list.get(i).getCity_studentFrom() > 50) {
                    d = 4 * 0.15;
                } else if (list.get(i).getCity_studentFrom() > 20) {
                    d = 3 * 0.15;
                } else if (list.get(i).getCity_studentFrom() > 10) {
                    d = 2 * 0.15;
                } else if (list.get(i).getCity_studentFrom() > 0) {
                    d = 1 * 0.15;
                }
            }


            //往届走访
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity_visit() >= 4) {
                    e = 5 * 0.15;
                } else if (list.get(i).getCity_visit() >= 3) {
                    e = 4 * 0.15;
                } else if (list.get(i).getCity_visit() >= 2) {
                    e = 3 * 0.15;
                } else if (list.get(i).getCity_visit() >= 1) {
                    e = 2 * 0.15;
                } else if (list.get(i).getCity_visit() >= 0) {
                    e = 1 * 0.15;
                }
            }


            //城市分级
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity_grading().equals("一线城市")) {
                    f = 5 * 0.15;
                } else if (list.get(i).getCity_grading().equals("新一线城市")) {
                    f = 4 * 0.15;
                } else if (list.get(i).getCity_grading().equals("二线城市")) {
                    f = 3 * 0.15;
                } else if (list.get(i).getCity_grading().equals("三线城市")) {
                    f = 2 * 0.15;
                } else if (list.get(i).getCity_grading().equals("四线城市")) {
                    f = 2 * 0.15;
                } else if (list.get(i).getCity_grading().equals("其他情况")) {
                    f = 1 * 0.15;
                }
            }
            list.get(j).setCity_score(a + b + c + d + e + f);
        }
        return list;
    }


}
