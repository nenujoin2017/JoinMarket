package com.nenu.market.controller;

import com.nenu.market.entity.User;
import com.nenu.market.service.userservice.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping("/listAll")
    public List getAllUsers(){
        User user = new User();
        user.setUsername("123");
        List list = new ArrayList();
        list.add(user);
        return list;
    }

    @RequestMapping("/viewRcvTest")
    public String viewRcv(){
        return "viewresolvertest";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        userService.logout();
        return "viewresolvertest";
    }
    @RequestMapping("/login")
    public String login(String username,String password){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
        }catch (UnknownAccountException e){
            System.out.println("用户名不存在");
            return "redirect:toLogin";
        }catch (IncorrectCredentialsException e){
            System.out.println("密码错误");
            return "redirect:toLogin";
        }
        return "success";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("/unAuth")
    public String unAuthorized(){
        return "unAuth";
    }
}
