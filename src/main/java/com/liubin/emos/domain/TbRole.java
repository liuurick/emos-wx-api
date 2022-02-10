package com.liubin.emos.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色表
 *
 * @TableName tb_role
 */
@Data
public class TbRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String roleName;

    private Object permissions;

    private String desc;

    private String defaultPermissions;

    private Boolean systemic;
}