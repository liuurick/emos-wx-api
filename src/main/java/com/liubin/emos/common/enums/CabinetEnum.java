package com.liubin.emos.common.enums;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * 配电柜类型
 * @author liubin
 * @date 2022/1/17
 */
@JSONType(serializer = EnumBaseSerializer.class)
public enum CabinetEnum {

    INCOMING_CABINET("进线柜", 1),

    OUTLET_CABINET("出线柜", 2),

    CAPACITOR_CABINET("电容柜", 3);

    private String content;

    private Integer value;

    CabinetEnum(String content, Integer value) {
        this.content = content;
        this.value = value;
    }

    public static CabinetEnum getByValue(Integer value) {
        CabinetEnum[] types = CabinetEnum.values();
        for (CabinetEnum type : types) {
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
