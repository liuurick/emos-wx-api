package com.liubin.emos.common.enums;

/**
 * 产品类型
 * @author liubin
 * @date 2021/12/27
 */
public enum ProductTypeEnum {

    SAAS(1, "云快缴"),

    DMS(2, "配电运维");

    private Integer code;

    private String alias;

    ProductTypeEnum(Integer code, String alias) {
        this.code = code;
        this.alias = alias;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
