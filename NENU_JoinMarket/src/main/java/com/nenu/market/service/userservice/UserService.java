package com.nenu.market.service.userservice;

import com.nenu.market.entity.User;

import java.util.List;

public interface UserService {

    List getAllUsers();
    User findByName(String name);
    User findById(int id);
    void logout();
    void addUser();
}
