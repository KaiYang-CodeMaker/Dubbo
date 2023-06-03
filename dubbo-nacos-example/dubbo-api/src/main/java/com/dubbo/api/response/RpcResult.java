package com.dubbo.api.response;

import com.dubbo.api.ResultCodeEnum;

import java.io.Serializable;

public class RpcResult<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    private Boolean success;

    private RpcResult(){
        this.code = 200;
        this.success = true;
    }

    private RpcResult(T data){
        this.data = data;
    }

    private RpcResult(ResultCodeEnum resultCodeEnum){
        this.success = false;
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
    }

    public static<T> RpcResult<T> success(){
        return new RpcResult();
    }

    public static<T> RpcResult<T> success(T data){
        return new RpcResult<>(data);
    }

    public static<T> RpcResult<T> fail(ResultCodeEnum resultCodeEnum){
        return new RpcResult<T>(resultCodeEnum);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "RpcResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", success=" + success +
                '}';
    }
}
