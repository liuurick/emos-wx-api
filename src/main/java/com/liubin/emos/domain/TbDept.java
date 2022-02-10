package com.liubin.emos.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * tb_dept
 *
 * @author
 */
@Data
public class TbDept implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String deptName;

}