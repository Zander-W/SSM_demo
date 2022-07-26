package net.zh.dao;

import net.zh.entity.Admin;

import java.util.List;

/**
 * @author Zander
 */
public interface AdminMapper {
    /**
     * 查询所有管理员信息
     */
    List<Admin> getAllAdmin();
}
