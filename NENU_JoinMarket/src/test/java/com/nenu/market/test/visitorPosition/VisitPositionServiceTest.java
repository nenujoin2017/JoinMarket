package com.nenu.market.test.visitorPosition;

import com.nenu.market.entity.visitorPosition.VisitPosition;
import com.nenu.market.service.visitorPosition.VisitPositionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: xinlee dage test
 * @Description:
 * @Date: 16:57 2019/5/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitPositionServiceTest {
    @Autowired
    VisitPositionService visitPositionService;
    @Test
    public void testListAllVisitPosition(){
        List<VisitPosition> list=visitPositionService.listAllVisitPosition();
        System.out.println(list);
    }
    @Test
    public void testAddVisitPosition(){
        VisitPosition visitPosition=new VisitPosition();
        visitPosition.setCompany_name("1");
        visitPosition.setContact("2");
        visitPosition.setEmail("3");
        visitPosition.setFixedphone("4");
        visitPosition.setMobiephone("5");
        visitPosition.setPosition("6");
        visitPosition.setWebchatqq("7");
        visitPosition.setVisitor_name("打嗝");
        visitPosition.setTime("2019/7/8");
        System.out.println(visitPositionService.addVisitPosition(visitPosition));
    }
    @Test
    public void testupdateVisitPosition(){
        VisitPosition visitPosition=new VisitPosition();
        visitPosition.setId(3);
        visitPosition.setWebchatqq("2");
        visitPosition.setPosition("2");
        visitPosition.setMobiephone("2");
        visitPosition.setFixedphone("2");
        visitPosition.setEmail("2");
        visitPosition.setContact("2");
        visitPosition.setCompany_name("2");
        visitPosition.setVisitor_name("打嗝");
        visitPosition.setTime("2019/7/8");
        System.out.println(visitPositionService.updateVisitPosition(visitPosition));
    }

    @Test
    public void testQueryVisitPosition(){
        String year = "2";
        System.out.println(visitPositionService.queryVisitPosition("2",year));
    }
    @Test
    public void testSearch(){
        System.out.println(visitPositionService.listVisitPosition("1","1","1"));
    }
}
