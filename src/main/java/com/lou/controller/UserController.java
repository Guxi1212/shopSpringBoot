package com.lou.controller;

import com.lou.pojo.Userdata;
import com.lou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //登录功能
    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, HttpSession session, Model model) {
        //判断输入是否为空
        if(username==null||username.equals("")||password==null||password.equals("")){
            model.addAttribute("errorMsg","用户名或密码为空");
            return "login";
        }
        //判断用户名与密码是否对应
        Userdata userdata=userService.doLogin(username,password);
        if(userdata!=null){
            session.setAttribute("user",userdata);
            return "index";
        }else {
            model.addAttribute("errorMsg","用户名或密码输入错误");
            return "login";
        }
    }
    //注册功能
    @RequestMapping("/doSign")
    public String doSign(String username,String password,Model model){
        //判断输入是否为空
        if(username==null||username.equals("")||password==null||password.equals("")){
            model.addAttribute("errorMsg","用户名或密码为空");
            return "login";
        }
        //判断是否注册成功
        int is_sign=userService.doSign(username,password);
        if(is_sign==1){
            return "login";
        }else {
            model.addAttribute("errorMsg","用户名已存在");
            return "login";
        }
    }
    //退出登录
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }
}
