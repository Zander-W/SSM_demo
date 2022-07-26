package net.zh.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.zh.dao.AdminMapper;
import net.zh.entity.Admin;

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

        System.out.println("在adminService查询出的数据："+adminList);
        System.out.println("数据长度："+adminList.size());

        return adminMapper.getAllAdmin();
    }
}
