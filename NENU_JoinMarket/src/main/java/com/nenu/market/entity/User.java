package com.nenu.market.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -2875497843802360359L;

    int id;

    String userName;
    String passWord;
    String perms;

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perm) {
        this.perms = perm;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }


}
