package com.nenu.market.test.ParticipationIntention;

import com.nenu.market.service.participation_intension.ParticipationIntentionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PItest {
    @Autowired
    ParticipationIntentionService participationIntentionService;

    @Test
    public void testPIQueryByCVT(){
        try{
            System.out.println(participationIntentionService.listByCVT("东师","打嗝嗝嗝","2019/7/23"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
