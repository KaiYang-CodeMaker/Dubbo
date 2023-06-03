package com.dubbo.api.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class FirstDubboReturnDemoDTO implements Serializable {

    private Integer num;

    private String msg;

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum(){
        return this.num;
    }
}
