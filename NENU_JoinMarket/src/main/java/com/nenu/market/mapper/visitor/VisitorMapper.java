package com.nenu.market.mapper.visitor;

import com.nenu.market.entity.visitor.Visitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: CaiyuHan
 * @Description: DAGE
 * @Date: 17:16 2019/5/16
 */

@Mapper
@Repository
public interface VisitorMapper {
    /**
     * 列出所有走访人员信息
     * @return
     */
    public List<Visitor> listAllVisitor();

    /**
     * 增加走访人员信息
     * @param visitor
     */
    public void addVisitor(@Param("Visitor") Visitor visitor);

    /**
     * 修改走访人员信息
     * @param visitor
     */
    public void updateVisitor(@Param("Visitor") Visitor visitor);

    /**
     * 根据单位名称和走访人员搜索出走访人员信息
     * @param company_name
     * @return
     */
    public Visitor queryVisitorByCompanyNameAndVisitorName(@Param("company_name") String company_name, @Param("visitor_name") String visitor_name, @Param("time") String time);

    /**
     * 根据关键字和年份搜索走访人员信息
     * @param keyword
     * @param year
     * @return
     */
    public List<Visitor> queryVisitor(@Param("keyword") String keyword, @Param("year") String year);
}
