package com.example.turkcellmarket.core.exception.types;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {
    private final HttpStatus httpStatus;

    public BusinessException(String message){
        super(message);
        httpStatus = HttpStatus.BAD_REQUEST;
    }

    public BusinessException(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }

    public BusinessException(String message, HttpStatus httpStatus){
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus(){
        return this.httpStatus;
    }
}
