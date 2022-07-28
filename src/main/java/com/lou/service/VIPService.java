package com.lou.service;

import com.lou.pojo.VipTable;

import java.util.List;

public interface VIPService {
    //查询所有vip用户
    List<VipTable> queryAllVip();
    //增加会员用户
    void addVip(VipTable vipTable);
    //查询指定用户信息
    VipTable toUpdateVip(Integer id);
    //修改会员用户信息
    void UpdateVip(VipTable vipTable);
    //删除会员
    void deleteVip(Integer id);
}
