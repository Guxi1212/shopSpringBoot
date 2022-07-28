package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.Gys;
import com.lou.pojo.GysSp;
import com.lou.pojo.GysSpExample;
import com.lou.pojo.Sp;
import com.lou.service.GysSpService;
import com.lou.service.SpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SpController {
    private final int PAGE_SIZE=6;
    @Resource
    private SpService spService;
    @Resource
    private GysSpService gysSpService;
    @RequestMapping("/queryAllSp")
    public ModelAndView queryAllSp(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        List<Sp> spList=spService.queryAllSp();
        ModelAndView mv=new ModelAndView();
        mv.addObject("spList",spList);
        PageInfo pageInfo=new PageInfo<>(spList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("sptable");
        return mv;
    }

    @RequestMapping("/toAddSp")
    public ModelAndView toAddSp(){
        List<Gys> gysList=spService.queryAllGys();
        ModelAndView mv=new ModelAndView();
        mv.addObject("gysList",gysList);
        mv.setViewName("NewSp");
        return mv;
    }
    @RequestMapping("/addSp")
    public String addSp(Sp sp, String gid, Model model){
        if(sp.getSid()==null||sp.getSid().equals("")||sp.getDanjia()==null||sp.getDanwei()==null||sp.getHuiyuanjia()==null||sp.getTiaoma()==null||sp.getZhekou()==null){
            model.addAttribute("errorMsg","未填写完善");
            return "NewSp";
        }
        spService.addSp(sp,gid);
        return "redirect:queryAllSp";
    }

    @RequestMapping("/toUpdateSp")
    public ModelAndView toUpdateSp(Integer id){
        Sp sp=spService.querySpById(id);
        List<Gys> gysList=spService.queryAllGys();
        ModelAndView mv=new ModelAndView();
        mv.addObject("sp",sp);
        mv.addObject("gysList",gysList);
        mv.setViewName("UpdateSp");
        return mv;
    }

    @RequestMapping("/upDateSp")
    public String upDateSp(Sp sp,String gid,String oldSid){

        spService.updateSp(sp,gid,oldSid);

        return "redirect:queryAllSp";
    }
    @RequestMapping("/toDeleteSp")
    public String toDeleteSp(Integer id){
        spService.deleteSpById(id);
        return "redirect:queryAllSp";
    }
}
