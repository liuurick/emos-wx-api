package com.liubin.emos.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * tb_city
 *
 * @author
 */
@Data
public class TbCity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 城市名称
     */
    private String city;

    /**
     * 拼音简称
     */
    private String code;

}