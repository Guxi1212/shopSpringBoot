package com.lou.service.impl;

import com.lou.mapper.UserdataMapper;
import com.lou.pojo.Userdata;
import com.lou.pojo.UserdataExample;
import com.lou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserdataMapper userdataMapper;
    @Override
    public Userdata doLogin(String username, String password) {
        UserdataExample userdataExample=new UserdataExample();
        UserdataExample.Criteria criteria=userdataExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<Userdata> userdataList=userdataMapper.selectByExample(userdataExample);
        if(userdataList!=null&&userdataList.size()>0){
            return userdataList.get(0);
        }

        return null;
    }

    @Override
    public int doSign(String username, String password) {
        UserdataExample userdataExample=new UserdataExample();
        UserdataExample.Criteria criteria=userdataExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Userdata> userdataList=userdataMapper.selectByExample(userdataExample);
        if(userdataList!=null&&userdataList.size()>0){
            return 0;
        }else {
            Userdata userdata=new Userdata();
            userdata.setUsername(username);
            userdata.setPassword(password);
            userdataMapper.insert(userdata);
            return 1;
        }
    }
}
