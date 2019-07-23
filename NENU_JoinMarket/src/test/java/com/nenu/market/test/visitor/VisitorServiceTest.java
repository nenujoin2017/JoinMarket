package com.nenu.market.test.visitor;



import com.nenu.market.entity.visitor.Visitor;
import com.nenu.market.mapper.visitor.VisitorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: CaiyuHan
 * @Description: DAGE
 * @Date: 18:24 2019/5/16
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitorServiceTest {
    @Autowired
    VisitorMapper visitorMapper;

    @Test
    public void testListAllVisitor(){
        System.out.println(visitorMapper.listAllVisitor());
    }

    @Test
    public void addVisitor(){
        Visitor visitor = new Visitor();
        visitor.setCompany_name("东师理想");
        visitor.setCompany_nature("单位性质");
        visitor.setCompany_place("辽宁沈阳");
        visitor.setConclude("好");
        visitor.setFeedback("不错");
        visitor.setPostcode("100000");
        visitor.setTime("2018/2/3");
        visitor.setVisitor_name("dagedage");
        visitorMapper.addVisitor(visitor);
        System.out.println(visitorMapper.listAllVisitor());
    }

    @Test
    public void testUpdateVisitor(){
        Visitor visitor = new Visitor();
        visitor.setId(1);
        visitor.setCompany_name("东师");
        visitor.setCompany_nature("性质");
        visitor.setCompany_place("沈阳");
        visitor.setConclude("不好");
        visitor.setFeedback("错");
        visitor.setPostcode("101000");
        visitor.setTime("2019/2/3");
        visitor.setVisitor_name("打嗝嗝嗝");
        visitorMapper.updateVisitor(visitor);
        System.out.println(visitorMapper.listAllVisitor());
    }

    @Test
    public void testQueryVisitorByCompanyNameAndVisitorName(){
        System.out.println(visitorMapper.queryVisitorByCompanyNameAndVisitorName("东师理想","打嗝","2018/2/3"));
    }

    @Test
    public void testQueryVisitor(){
        System.out.println(visitorMapper.queryVisitor("东师","2018"));
    }
}
