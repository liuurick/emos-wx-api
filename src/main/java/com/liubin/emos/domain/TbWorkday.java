package com.liubin.emos.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_workday
 *
 * @author
 */
@Data
public class TbWorkday implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 日期
     */
    private Date date;

}