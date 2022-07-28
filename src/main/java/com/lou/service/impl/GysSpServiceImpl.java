package com.lou.service.impl;

import com.lou.mapper.GysSpMapper;
import com.lou.pojo.GysSp;
import com.lou.service.GysSpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GysSpServiceImpl implements GysSpService {

    @Resource
    private GysSpMapper gysSpMapper;
    @Override
    public void addGysSp(GysSp gysSp) {
        gysSpMapper.insert(gysSp);
    }
}
