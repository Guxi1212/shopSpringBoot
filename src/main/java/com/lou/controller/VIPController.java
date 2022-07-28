package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.VipTable;
import com.lou.service.VIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VIPController {
    private static final int PAGE_SIZE = 6;
    @Autowired
    private VIPService vipService;

    @RequestMapping("/queryAllVip")
    public ModelAndView queryAllVip(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        ModelAndView mv = new ModelAndView();
        List<VipTable> vipTableList = vipService.queryAllVip();
        mv.addObject("vipTableList",vipTableList);
        PageInfo pageInfo=new PageInfo<>(vipTableList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("viptable");
        return mv;
    }


    @RequestMapping("/addVip")
    public String addVip(VipTable vipTable, Model model){
        if(vipTable.getHid()==null||vipTable.getUid().equals("")||vipTable.getTime()==null||vipTable.getTime().equals("")||vipTable.getHid().equals("")||vipTable.getUid()==null){
            model.addAttribute("errorMsg","未填写完善");
            return "NewVip";
        }
        vipService.addVip(vipTable);
        return "redirect:/queryAllVip";
    }

    @RequestMapping("/toUpdateVip")
    public ModelAndView toUpdateVip(Integer id){
        VipTable vipTable = vipService.toUpdateVip(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("vipTable",vipTable);
        mv.setViewName("UpdateVip");
        return mv;
    }

    @RequestMapping("/UpdateVip")
    public String UpdateVip(VipTable vipTable){
        vipService.UpdateVip(vipTable);
        return "redirect:/queryAllVip";
    }

    @RequestMapping("/deleteVip")
    public String deleteVip(Integer id){
        vipService.deleteVip(id);
        return "redirect:/queryAllVip";
    }
}
