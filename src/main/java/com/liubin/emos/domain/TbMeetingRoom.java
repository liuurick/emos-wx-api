package com.liubin.emos.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbMeetingRoom implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Short max;
    private String desc;
    private Byte status;
}
