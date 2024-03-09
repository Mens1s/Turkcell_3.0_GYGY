package com.example.turkcellmarket.core.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException{
    private final HttpStatus httpStatus;

    public CustomException(String message){
        super(message);
        httpStatus = HttpStatus.BAD_REQUEST;
    }

    public CustomException(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }

    public CustomException(String message, HttpStatus httpStatus){
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus(){
        return this.httpStatus;
    }
}
