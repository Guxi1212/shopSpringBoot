package com.lou.service;

import com.lou.pojo.Userdata;

public interface UserService {
    Userdata doLogin(String username, String password);

    int doSign(String username,String password);


}
