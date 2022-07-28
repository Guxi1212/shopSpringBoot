package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.Purchase;
import com.lou.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PurchaseController {
    private final int PAGE_SIZE=5;
    @Resource
    private PurchaseService purchaseService;

    @RequestMapping("/queryAllPurchase")
    public ModelAndView queryAllPurchase(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        ModelAndView mv = new ModelAndView();
        List<Purchase> PurchaseList = purchaseService.queryAllPurchase();
        mv.addObject("PurchaseList",PurchaseList);
        PageInfo pageInfo = new PageInfo<>(PurchaseList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("Purchasetable");
        return mv;
    }

    @RequestMapping("/addPurchase")
    public String addPurchase(Purchase purchase, Model model){
        if(purchase.getCount()==null||purchase.getGname()==null||purchase.getGysname()==null||purchase.getGname().equals("")){
            model.addAttribute("errorMsg","未填写完善");
            return "NewPurchase";
        }
        purchaseService.addPurchase(purchase);
        return "redirect:queryAllPurchase";
    }

    @RequestMapping("/toUpdatePurchase")
    public ModelAndView toUpdatePurchase(Integer id){
        Purchase purchase = purchaseService.queryPurchaseById(id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("purchase",purchase);
        mv.setViewName("UpdatePurchase");
        return mv;
    }

    @RequestMapping("/UpdatePurchase")
    public String UpdatePurchase(Purchase purchase){
        purchaseService.updatePurchase(purchase);
        return "redirect:queryAllPurchase";
    }

    @RequestMapping("/toDeletaPurchase")
    public String toDeletaPurchase(Integer id){
        purchaseService.deletePurchaseById(id);
        return "redirect:queryAllPurchase";
    }

    @RequestMapping("/queryGetin")
    public ModelAndView queryGetin(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        ModelAndView mv = new ModelAndView();
        List<Purchase> PurchaseList = purchaseService.queryAllPurchase();
        List<Purchase> PurchaseLessList = new ArrayList<>();
        for(int i=0;i<PurchaseList.size();i++){
            if(PurchaseList.get(i).getCount() <= 50) {
                PurchaseLessList.add(PurchaseList.get(i));
            }
        }
        mv.addObject("PurchaseLessList",PurchaseLessList);
        PageInfo pageInfo = new PageInfo<>(PurchaseLessList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("Getintable");
        return mv;
    }
}
