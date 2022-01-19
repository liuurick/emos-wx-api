package com.liubin.emos.common.enums;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * @author liubin
 * @date 2022/1/17
 */
@JSONType(serializer = EnumBaseSerializer.class)
public enum DeviceTypeEnum {

    /**
     * 电力监测仪
     */
    POWER_SUPERVISOR_DEVICE("电力监测仪", 1),

    /**
     * 单项电表
     */
    SINGLE_PHASE_METER("单项电表", 2),

    /**
     * 三相电表
     */
    THREE_PHASE_METER("三相电表", 1);

    private String content;

    private Integer value;

    DeviceTypeEnum(String content, Integer value) {
        this.content = content;
        this.value = value;
    }

    public static DeviceTypeEnum getByValue(Integer value) {
        DeviceTypeEnum[] types = DeviceTypeEnum.values();
        for (DeviceTypeEnum type : types) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getValue() {
        return this.value;
    }
}
