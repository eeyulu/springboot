package com.imooc.enums;

public enum ResultEnum {
    UNKNOW_ERROR(-1,"求知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"小学"),
    MIDDLE_SCHOOL(101,"初中");
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
