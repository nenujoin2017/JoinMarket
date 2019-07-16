package com.nenu.market.service.userservice.impl;

import com.nenu.market.entity.User;
import com.nenu.market.mapper.usermapper.UserMapper;
import com.nenu.market.service.userservice.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public List getAllUsers() {
        System.out.println(userMapper.getAllUsers()+"inServices");
        return userMapper.getAllUsers();
    }
    @Override
    @Cacheable(value = "UserCache")
    public User findByName(String name){
        return userMapper.findByName(name);
    }
    @Override
    public User findById(int id){
        return userMapper.findById(id);
    }
    @Override
    public void logout(){
         Subject subject = SecurityUtils.getSubject();
         subject.logout();
    }

    @Override
    public void addUser() {
        userMapper.addUser();
    }
}
