package com.liubin.emos.common.enums;

/**
 * @author liubin
 * @date 2021/12/27
 */
public enum MerchantTypeEnum {

    PARTNER(0, "合伙人（未授权）"),

    MERCHANT(1, "商户");

    private Integer code;

    private String alias;

    MerchantTypeEnum(Integer code, String alias) {
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
