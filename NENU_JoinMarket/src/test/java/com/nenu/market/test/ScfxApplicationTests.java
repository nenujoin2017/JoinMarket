//package com.nenu.market.test;
//
//import com.nenu.market.service.city.CityService;
//import com.nenu.market.service.userservice.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ScfxApplicationTests {
//    @Resource
//    UserService userService;
//    @Resource
//    CityService cityService;
//    @Resource
//    StringRedisTemplate stringRedisTemplate;
////    @Test
////    public void cityTest(){
////        int year = 2019;
////        List list = cityService.getCityExByYear(year);
////        System.out.println(list);
//////        System.out.println("序号\t类型\t城市名\t期望\t分级");
//////        for (Object o:list
//////             ) {
//////            CityXY city = (CityXY)o;
//////            System.ou.print(city.getId()+"\t");
//////            System.out.print("教育\t");
//////            System.out.print(city.getName()+"\t");
//////            System.out.print(city.getExceptaion()+"\t");
//////            System.out.println(city.getGrading());
//////        }
////    }
////    @Test
//    public void contextLoads() {
//    }
//    @Test
//    public void  redisTest(){
//        System.out.println(userService);
//    }
//}