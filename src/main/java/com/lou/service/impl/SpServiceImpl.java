package com.lou.service.impl;


import com.lou.mapper.GysMapper;
import com.lou.mapper.GysSpMapper;
import com.lou.mapper.SpMapper;
import com.lou.pojo.Gys;
import com.lou.pojo.GysSp;
import com.lou.pojo.GysSpExample;
import com.lou.pojo.Sp;
import com.lou.service.SpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpServiceImpl implements SpService {

    @Resource
    private SpMapper spMapper;
    @Resource
    private GysSpMapper gysSpMapper;
    @Resource
    private GysMapper gysMapper;

    @Override
    public List<Sp> queryAllSp() {

        return spMapper.selectByExample(null);
    }

    @Override
    public List<Gys> queryAllGys() {
        return gysMapper.selectByExample(null);
    }

    @Override
    public void addSp(Sp sp,String gid) {
        spMapper.insert(sp);
        GysSp gysSp=new GysSp();
        gysSp.setSid(sp.getSid());
        gysSp.setGid(gid);
        gysSpMapper.insert(gysSp);
    }

    @Override
    public Sp querySpById(Integer spid) {
        return spMapper.selectByPrimaryKey(spid);
    }

    @Override
    public void updateSp(Sp sp,String gid,String oldSid) {
        GysSpExample gysSpExample=new GysSpExample();
        GysSpExample.Criteria criteria=gysSpExample.createCriteria();
        criteria.andSidEqualTo(oldSid);
        List<GysSp>  gysSpList=gysSpMapper.selectByExample(gysSpExample);
        if(gysSpList!=null&&gysSpList.size()>0){
            GysSp gysSp=gysSpList.get(0);
            gysSp.setGid(gid);
            gysSp.setSid(sp.getSid());
            gysSpMapper.updateByPrimaryKey(gysSp);
        }
        spMapper.updateByPrimaryKey(sp);

    }

    @Override
    public void deleteSpById(Integer spid) {
        Sp sp =spMapper.selectByPrimaryKey(spid);
        GysSpExample gysSpExample=new GysSpExample();
        GysSpExample.Criteria criteria=gysSpExample.createCriteria();
        criteria.andSidEqualTo(sp.getSid());
        gysSpMapper.deleteByExample(gysSpExample);
        spMapper.deleteByPrimaryKey(spid);
    }

}
