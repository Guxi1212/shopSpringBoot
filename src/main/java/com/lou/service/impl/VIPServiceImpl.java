package com.lou.service.impl;

import com.lou.mapper.VipTableMapper;
import com.lou.pojo.VipTable;
import com.lou.service.VIPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VIPServiceImpl implements VIPService {
    @Resource
    private VipTableMapper vipTableMapper;

    @Override
    public List<VipTable> queryAllVip() {
        return vipTableMapper.selectByExample(null);
    }

    @Override
    public void addVip(VipTable vipTable) {
        vipTableMapper.insert(vipTable);
    }

    @Override
    public VipTable toUpdateVip(Integer id) {
        return vipTableMapper.selectByPrimaryKey(id);
    }

    @Override
    public void UpdateVip(VipTable vipTable) {
        vipTableMapper.updateByPrimaryKey(vipTable);
    }

    @Override
    public void deleteVip(Integer id) {
        vipTableMapper.deleteByPrimaryKey(id);
    }
}
