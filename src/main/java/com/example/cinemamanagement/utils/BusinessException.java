package com.example.cinemamanagement.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends RuntimeException {

    private BaseMessage error;

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
        this.error = new BaseMessage() {
            @Override
            public String getCode() {
                return "0001";
            }

            @Override
            public String getDesc() {
                return "Unhandled error";
            }

            @Override
            public ErrorMessage format(Object... str) {
                return null;
            }
        };
    }

    public BusinessException(BaseMessage error) {
        super(error.getDesc());
        this.error = error;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BusinessException(ResponseData<?> response) {
        super(response.getDesc());
        this.error = new BaseMessage() {
            @Override
            public String getCode() {
                return response.getCode();
            }

            @Override
            public String getDesc() {
                return response.getDesc();
            }

            @Override
            public ErrorMessage format(Object... str) {
                return null;
            }
        };
    }

}
