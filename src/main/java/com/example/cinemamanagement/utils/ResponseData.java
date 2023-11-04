package com.example.cinemamanagement.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseData<T> {

    private String code;
    private String desc;
    private T data;

    public ResponseData() {
    }

    public ResponseData(String code) {
        this.code = code;
    }

    public ResponseData(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public ResponseData(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseData(String code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public static <T> ResponseData<T> success() {
        return new ResponseData<T>(BaseMessage.CODE_SUCCESS, BaseMessage.DESC_SUCCESS);
    }

    public static <T> ResponseData<T> success(T data) {
        return new ResponseData<T>(BaseMessage.CODE_SUCCESS, BaseMessage.DESC_SUCCESS, data);
    }

    public static <T> ResponseData<T> error(BaseMessage error) {
        return new ResponseData<T>(error.getCode(), error.getDesc());
    }

    public static <T> ResponseData<T> error(BaseMessage error, T data) {
        return new ResponseData<T>(error.getCode(), error.getDesc(), data);
    }
}
