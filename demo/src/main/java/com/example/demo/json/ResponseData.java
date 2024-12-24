package com.example.demo.json;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {

    private Boolean result;
    private String code;
    private String msg;
    private T data;

    public ResponseData(Boolean result, String code, String msg, T data) {
        this.result = result;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(Boolean result, String code, String msg) {
        this.result = result;
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(ResultEnums resultEnums, Boolean result) {
        this.result = result;
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
    }

    public ResponseData(ResultEnums resultEnums, Boolean result, T data) {
        this.result = result;
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.data = data;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
}
