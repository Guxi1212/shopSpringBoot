package com.lou.service.impl;

import com.lou.mapper.MendianMapper;
import com.lou.pojo.Mendian;
import com.lou.pojo.MendianExample;
import com.lou.service.MendianService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MendianServiceImpl implements MendianService {

    @Resource
    private MendianMapper mendianMapper;
    @Override
    public List<Mendian> queryAllMendians() {
        //MendianExample mendianExample=new MendianExample();
        return mendianMapper.selectByExample(null);
    }

    @Override
    public void addMendian(Mendian mendian) {
        mendianMapper.insert(mendian);
    }

    @Override
    public Mendian queryMendianById(Integer mid) {

        return mendianMapper.selectByPrimaryKey(mid);
    }

    @Override
    public void updateMendian(Mendian mendian) {
        mendianMapper.updateByPrimaryKey(mendian);
    }

    @Override
    public void deleteMendianById(Integer mid) {
        mendianMapper.deleteByPrimaryKey(mid);
    }
}
