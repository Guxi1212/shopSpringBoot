package com.lou.service;

import com.lou.pojo.Gys;

import java.util.List;

public interface GysService {
    List<Gys> queryAllGys();

    void addGys(Gys gys);

    Gys queryGysById(Integer id);

    void updateGys(Gys gys);

    void deleteGysById(Integer id);
}