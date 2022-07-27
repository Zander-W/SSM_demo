package net.zh.controller;

import net.zh.entity.Admin;
import net.zh.serivce.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    /**
     * 从容器中获取admin对象
     */
    @Autowired
    AdminService adminService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    /**
     * 登陆
     */
    @RequestMapping("/login")
    public String login(Admin admin, HttpSession session, Model model) {
        //调用AdminService验证填写信息
        Boolean result = adminService.checkLogin(admin, session);
        if (result == true) {
            return "index";
        } else {
            model.addAttribute("msg", "用户名、密码或管理员类型选择错误");
            return "login";
        }

    }

}
