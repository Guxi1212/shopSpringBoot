package com.lou.service;
import com.lou.pojo.Purchase;
import java.util.List;

public interface PurchaseService {
    List<Purchase> queryAllPurchase();

    void addPurchase(Purchase purchase);

    Purchase queryPurchaseById(Integer id);

    void updatePurchase(Purchase purchase);

    void deletePurchaseById(Integer id);
}
