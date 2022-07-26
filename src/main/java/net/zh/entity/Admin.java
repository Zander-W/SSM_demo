package net.zh.entity;

import lombok.Data;

/**
 * @author Zander
 */
@Data
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Integer adminType;
}
