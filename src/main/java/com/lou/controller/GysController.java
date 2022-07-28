package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.Gys;
import com.lou.service.GysService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GysController {
    private final int PAGE_SIZE=5;
    @Resource
    private GysService gysService;
    @RequestMapping("/queryAllGys")
    public ModelAndView queryAllGys(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        ModelAndView mv = new ModelAndView();
        List<Gys> GysList = gysService.queryAllGys();
        mv.addObject("GysList",GysList);
        PageInfo pageInfo = new PageInfo<>(GysList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("gystable");
        return mv;
    }

    @RequestMapping("/addGys")
    public String addGys(Gys gys, Model model){
        if(gys.getGname()==null||gys.getGname().equals("")){
            model.addAttribute("errorMsg","未填写完善");
            return "NewGys";
        }
        gysService.addGys(gys);
        return "redirect:queryAllGys";
    }

    @RequestMapping("/toUpdateGys")
    public ModelAndView toUpdateGys(Integer id){
        Gys gys = gysService.queryGysById(id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("gys",gys);
        mv.setViewName("UpdateGys");
        return mv;
    }

    @RequestMapping("/UpdateGys")
    public String UpdateGys(Gys gys){
        System.out.println("aaa");
        gysService.updateGys(gys);
        return "redirect:queryAllGys";
    }

    @RequestMapping("/toDeleteGys")
    public String toDeleteGys(Integer id){
        gysService.deleteGysById(id);
        return "redirect:queryAllGys";
    }
}
