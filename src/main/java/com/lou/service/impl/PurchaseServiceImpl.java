package com.lou.service.impl;

import com.lou.mapper.PurchaseMapper;
import com.lou.pojo.Purchase;
import com.lou.service.PurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Resource
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> queryAllPurchase(){
        return purchaseMapper.selectByExample(null);
    }

    @Override
    public void addPurchase(Purchase purchase){
        purchaseMapper.insert(purchase);
    }

    @Override
    public Purchase queryPurchaseById(Integer id){
        return purchaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updatePurchase(Purchase purchase){
        purchaseMapper.updateByPrimaryKey(purchase);
    }

    @Override
    public void deletePurchaseById(Integer id){
        purchaseMapper.deleteByPrimaryKey(id);
    }
}
