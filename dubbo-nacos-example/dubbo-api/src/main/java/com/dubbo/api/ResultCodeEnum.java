package com.dubbo.api;

public enum ResultCodeEnum {


    SUCCESS(200,"success"),
    ERROR(500,"error");


    private Integer code;

    private String msg;

    ResultCodeEnum(Integer code,String msg){
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
