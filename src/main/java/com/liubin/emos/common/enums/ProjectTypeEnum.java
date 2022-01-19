package com.liubin.emos.common.enums;

/**
 * 项目类型
 *
 * @author liubin
 * @date 2021/12/27
 */
public enum ProjectTypeEnum {

    INC(1, "inc"),

    OPR(2, "opr"),

    SAAS_MC(3, "云快缴mc"),

    DMS_MC(4, "配电运维mc");

    private Integer code;

    private String alias;

    ProjectTypeEnum(Integer code, String alias) {
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
