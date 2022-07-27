package net.zh.serivce;

import net.zh.dao.AdminMapper;
import net.zh.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class AdminService {
    /**
     * 从容器中获取adminMapper
     */
    @Autowired
    AdminMapper adminMapper;

    /**
     * 展示管理员信息业务
     */
    public List<Admin> getAdmin() {
        //service调用mapper
        List<Admin> adminList = adminMapper.getAllAdmin();

        System.out.println("在adminService查询出的数据：" + adminList);
        System.out.println("数据长度：" + adminList.size());

        return adminMapper.getAllAdmin();
    }

    /**
     * 验证登录
     */
    public Boolean checkLogin(Admin admin, HttpSession session) {
        //根据用户名，密码，管理员类型进行用户查询
        Admin a = adminMapper.getAdminCheckLogin(admin);
        //判断查询出来的 a 是否为空，不为空则睡说明在数据库中有对应的匹配信息，允许登录
        if (a != null) {
            //如果登陆成功，将登陆后的管理员信息存放到session内
            session.setAttribute("LoginAdmin", a);
            return true;
        } else {
            return false;
        }

    }
}

