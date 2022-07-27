package net.zh.dao;

import net.zh.entity.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Zander
 */
public interface AdminMapper {
    /**
     * 查询所有管理员信息
     */
    List<Admin> getAllAdmin();

    /**
     * 通过用户名，密码，管理员类型进行登录
     */
    @Select("select * from admin where username=#{username} and password=#{password} and adminType = #{adminType}")
    Admin getAdminCheckLogin(Admin admin);
    //完成业务逻辑 Service
}

