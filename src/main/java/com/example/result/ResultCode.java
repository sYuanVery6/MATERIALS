package com.example.result;

public enum ResultCode {
    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);


    public Integer code;

    ResultCode(Integer code) {
        this.code = code;
    }
}
