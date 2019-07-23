package com.nenu.market.service.visitor;


import com.nenu.market.entity.visitor.Visitor;

import java.util.List;

/**
 * @Author: CaiyuHan
 * @Description: DAGE
 * @Date: 17:24 2019/5/16
 */

public interface VisitorService {
    /**
     * 列出所有走访人员信息
     * @return
     */
    public List<Visitor> listAllVisitor();

    /**
     * 增加走访人员信息
     * @param visitor
     */
    public void addVisitor(Visitor visitor);

    /**
     * 修改走访人员信息
     * @param visitor
     */
    public void updateVisitor(Visitor visitor);

    /**
     * 根据单位名称搜索走访人员信息
     * @param company_name
     * @return
     */
    public Visitor queryVisitorByCompanyNameAndVisitorName(String company_name, String visitor_name, String time);

    /**
     *
     *根据关键字和年份搜索走访人员信息
     * @param keyword
     * @param year
     * @return
     */
    public List<Visitor> queryVisitor(String keyword, String year);
}
