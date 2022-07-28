package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.Userdata;
import com.lou.service.UserdataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserdataController {
    private final int PAGE_SIZE=5;
    @Resource
    private UserdataService userdataService;

    @RequestMapping("/queryAllUserdata")
    public ModelAndView queryAllUserdata(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        ModelAndView mv = new ModelAndView();
        List<Userdata> UserdataList = userdataService.queryAllUserdata();
        mv.addObject("UserdataList",UserdataList);
        PageInfo pageInfo = new PageInfo<>(UserdataList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("adminList");
        return mv;
    }

    @RequestMapping("/addUserdata")
    public String addUserdata(Userdata userdata){
        userdataService.addUserdata(userdata);
        return "redirect:queryAllUserdata";
    }

    @RequestMapping("/toUpdateUserdata")
    public ModelAndView toUpdateUserdata(Integer id){
        Userdata userdata = userdataService.queryUserdataById(id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("userdata",userdata);
        mv.setViewName("UpdateAdmin");
        return mv;
    }

    @RequestMapping("/UpdateUserdata")
    public String UpdateUserdata(Userdata userdata){
        userdataService.updateUserdata(userdata);
        return "redirect:queryAllUserdata";
    }

    @RequestMapping("/toDeleteUserdata")
    public String toDeleteUserdata(Integer id){
        userdataService.deleteUserdataById(id);
        return "redirect:queryAllUserdata";
    }
}
