package com.lou.service.impl;

import com.lou.mapper.UserdataMapper;
import com.lou.pojo.Userdata;
import com.lou.service.UserdataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserdataServiceImpl implements UserdataService {
    @Resource
    private UserdataMapper userdataMapper;

    @Override
    public List<Userdata> queryAllUserdata(){
        return userdataMapper.selectByExample(null);
    }

    @Override
    public void addUserdata(Userdata userdata){
        userdataMapper.insert(userdata);
    }

    @Override
    public Userdata queryUserdataById(Integer id){
        return userdataMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateUserdata(Userdata userdata){
        userdataMapper.updateByPrimaryKey(userdata);
    }

    @Override
    public void deleteUserdataById(Integer id){
        userdataMapper.deleteByPrimaryKey(id);
    }
}
