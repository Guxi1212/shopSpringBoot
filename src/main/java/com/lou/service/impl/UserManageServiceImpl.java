package com.lou.service.impl;

import com.lou.mapper.UserTableMapper;
import com.lou.pojo.UserTable;
import com.lou.service.UserManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserManageServiceImpl implements UserManageService {
    @Resource
    private UserTableMapper userTableMapper;
    @Override
    public List<UserTable> queryAllUser() {
        return userTableMapper.selectByExample(null);
    }

    public void addUser(UserTable userTable){
        userTableMapper.insert(userTable);
    }

    @Override
    public UserTable queryUserByID(Integer id) {
        return userTableMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateUser(UserTable userTable) {
        userTableMapper.updateByPrimaryKey(userTable);
    }

    @Override
    public void deleteUserById(Integer id) {
        userTableMapper.deleteByPrimaryKey(id);
    }
}
