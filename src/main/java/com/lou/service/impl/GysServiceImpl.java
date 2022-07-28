package com.lou.service.impl;

import com.lou.mapper.GysMapper;
import com.lou.pojo.Gys;
import com.lou.service.GysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GysServiceImpl implements GysService {
    @Resource
    private GysMapper gysMapper;

    @Override
    public List<Gys> queryAllGys(){
        return gysMapper.selectByExample(null);
    }

    @Override
    public void addGys(Gys gys){
        gysMapper.insert(gys);
    }
    @Override
    public Gys queryGysById(Integer id){
        return gysMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateGys(Gys gys){
        gysMapper.updateByPrimaryKey(gys);
    }

    @Override
    public void deleteGysById(Integer id){
        gysMapper.deleteByPrimaryKey(id);
    }

}
