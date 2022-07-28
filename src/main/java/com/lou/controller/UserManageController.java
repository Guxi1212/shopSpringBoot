package com.lou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lou.pojo.UserTable;
import com.lou.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserManageController {
    private static final int PAGE_SIZE = 6;
    @Autowired
    private UserManageService userManageService;

    @RequestMapping("/queryAllUser")
    public ModelAndView queryAllUser(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1")int pageNo){
        PageHelper.startPage(pageNo,PAGE_SIZE);
        List<UserTable> userTableList = userManageService.queryAllUser();
        ModelAndView mv = new ModelAndView();
        mv.addObject("userTableList",userTableList);
        PageInfo pageInfo=new PageInfo<>(userTableList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("usertable");
        return mv;
    }


    @RequestMapping("/addUser")
    public String addUser(UserTable userTable, Model model){
        if(userTable.getName()==null||userTable.getName().equals("")||userTable.getPhone()==null||userTable.getPhone().equals("")||userTable.getSex()==null||userTable.getUid()==null){
            model.addAttribute("errorMsg","未填写完善");
            return "NewUser";
        }
        userManageService.addUser(userTable);
        return "redirect:/queryAllUser";
    }
    @RequestMapping("/toUpdateUser")
    public ModelAndView toUpdateUser(Integer id){
        UserTable userTable=userManageService.queryUserByID(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("userTable",userTable);
        mv.setViewName("UpdateUser");
        return mv;
    }
    @RequestMapping("/updateUser")
    public String updateUser(UserTable userTable){
        userManageService.updateUser(userTable);
        return "redirect:/queryAllUser";
    }
    @RequestMapping("/deleteUserById")
    public String deleteUserById(Integer id){
        userManageService.deleteUserById(id);
        return "redirect:/queryAllUser";
    }
}
