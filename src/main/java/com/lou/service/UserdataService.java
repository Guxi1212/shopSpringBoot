package com.lou.service;

import com.lou.pojo.Userdata;

import java.util.List;

public interface UserdataService {
    //查询所有
    List<Userdata> queryAllUserdata();
    //添加管理员
    void addUserdata(Userdata userdata);
    //查询指定管理员
    Userdata queryUserdataById(Integer id);
    //修改管理员信息
    void updateUserdata(Userdata userdata);
    //删除管理员
    void deleteUserdataById(Integer id);
}
