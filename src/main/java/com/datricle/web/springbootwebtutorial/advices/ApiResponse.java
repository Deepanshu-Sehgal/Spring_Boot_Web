package com.datricle.web.springbootwebtutorial.advices;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {
    private LocalDateTime timeStamp;
    private T data;


    public ApiResponse() {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiResponse(T data) {
        this.data = data;
    }

    private ApiError error;

}