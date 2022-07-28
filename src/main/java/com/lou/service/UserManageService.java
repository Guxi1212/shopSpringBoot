package com.lou.service;

import com.lou.pojo.UserTable;

import java.util.List;

public interface UserManageService {
    //查询所有用户
    List<UserTable> queryAllUser();
    //添加用户
    void addUser(UserTable userTable);
    //查询指定id的用户
    UserTable queryUserByID(Integer id);
    //修改用户信息
    void updateUser(UserTable userTable);
    //删除指定用户
    void deleteUserById(Integer id);
}
