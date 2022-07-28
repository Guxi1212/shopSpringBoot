package com.lou.service;

import com.lou.pojo.Gys;
import com.lou.pojo.Sp;

import java.util.List;

public interface SpService {
    List<Sp> queryAllSp();

    List<Gys> queryAllGys();

    void addSp(Sp sp,String gid);

    Sp querySpById(Integer spid);

    void updateSp(Sp sp,String gid,String oldSid);

    void deleteSpById(Integer spid);

}
