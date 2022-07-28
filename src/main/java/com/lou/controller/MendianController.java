package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.Mendian;
import com.lou.service.MendianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MendianController {
    //设置一页中有几条数据
    private final int PAGE_SIZE=6;
    @Resource
    private MendianService mendianService;
    //查找所有门店
    @RequestMapping("/queryAllMendians")
    public ModelAndView queryAllMendians(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        List<Mendian> mendianList=mendianService.queryAllMendians();
        ModelAndView mv=new ModelAndView();
        mv.addObject("mendianList",mendianList);
        PageInfo pageInfo=new PageInfo<>(mendianList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("mendian");
        return mv;
    }

    //添加门店
    @RequestMapping("/addMendian")
    public String addMendian(Mendian mendian,Model model){
        //判断输入是否为空
        if(mendian.getDizhi()==null||mendian.getDizhi().equals("")||mendian.getMname()==null||mendian.getPhone()==null){
            model.addAttribute("errorMsg","未填写完善");
            return "NewMendian";
        }
        mendianService.addMendian(mendian);
        return "redirect:queryAllMendians";
    }

    //带门店信息前往修改页面
    @RequestMapping("/toUpdateMendian")
    public ModelAndView toUpdateMendian(Integer mid){
        Mendian mendian=mendianService.queryMendianById(mid);
        ModelAndView mv=new ModelAndView();
        mv.addObject("mendian",mendian);
        mv.setViewName("UpdateMendian");
        return mv;
    }

    //修改门店信息
    @RequestMapping("/upDateMendian")
    public String upDateMendian(Mendian mendian){
        mendianService.updateMendian(mendian);
        return "redirect:queryAllMendians";
    }

    //删除门店信息
    @RequestMapping("/toDeleteMendian")
    public String toDeleteMendian(Integer mid){
        mendianService.deleteMendianById(mid);
        return "redirect:queryAllMendians";
    }

}
