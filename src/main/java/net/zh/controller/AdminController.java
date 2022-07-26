package net.zh.controller;

import net.zh.entity.Admin;
import net.zh.serivce.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Zander
 */
@Controller
public class AdminController {
    /**
     * 从容器内获取AdminService对象注入到adminService属性当中
     */
    @Autowired
    AdminService adminService;

    @RequestMapping("/toShowAdmin")
    public String toShowAdmin(Model model) {
        /* 调用adminService的获取管理信息的方法 */
        List<Admin> adminList = adminService.getAdmin();
        System.out.println("在adminController查询出的数据：" + adminList);
        model.addAttribute("adminList", adminList);
        return "showAdmin";
    }
}
