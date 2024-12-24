package com.example.demo.json;

public class ResponseDataUtil {

    public static <T> ResponseData<T> buildSuccess(T data) {
        return new ResponseData<>(true, ResultEnums.SUCCESS.getCode(), ResultEnums.SUCCESS.getMsg(), data);
    }

    public static ResponseData<Void> buildSuccess() {
        return new ResponseData<>(true, ResultEnums.SUCCESS.getCode(), ResultEnums.SUCCESS.getMsg());
    }

    public static ResponseData<Void> buildSuccess(String msg) {
        return new ResponseData<>(true, ResultEnums.SUCCESS.getCode(), msg);
    }

    public static <T> ResponseData<T> buildError(String code, String msg, T data) {
        return new ResponseData<>(false, code, msg, data);
    }

    public static ResponseData<Void> buildError() {
        return new ResponseData<>(false, ResultEnums.ERROR.getCode(), ResultEnums.ERROR.getMsg());
    }

    public static ResponseData<Void> buildError(String msg) {
        return new ResponseData<>(false, ResultEnums.ERROR.getCode(), msg);
    }

    public static ResponseData<Void> buildError(String code, String msg) {
        return new ResponseData<>(false, code, msg);
    }
}
