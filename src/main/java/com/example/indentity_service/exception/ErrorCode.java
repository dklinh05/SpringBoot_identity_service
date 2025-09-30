package com.example.indentity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception"),
    INVALID_KEY(1001, "Invalid Message Key"),
    USER_EXISTED(1002,"user existed"),
    USERNAME_INVALID(1003,"user name must be at least 3 characters"),
    INVALID_PASSWORD(1004,"password must be at least 8 characters"),
    USER_NOT_EXISTED(1005,"user not existed");


    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
