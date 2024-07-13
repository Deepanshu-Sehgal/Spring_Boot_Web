package com.datricle.web.springbootwebtutorial.advices;

import java.time.LocalDateTime;

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