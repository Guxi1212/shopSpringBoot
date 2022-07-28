package com.lou.service;

import com.lou.pojo.Mendian;

import java.util.List;

public interface MendianService {
    List<Mendian> queryAllMendians();

    void addMendian(Mendian mendian);

    Mendian queryMendianById(Integer mid);

    void updateMendian(Mendian mendian);

    void deleteMendianById(Integer mid);
}
