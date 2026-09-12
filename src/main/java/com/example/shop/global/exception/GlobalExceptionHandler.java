package com.example.shop.global.exception;

import com.example.shop.global.response.ApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 모든 컨트롤러의 예외를 감지 [10]
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ApiResponse<?> handleCustomException(CustomException e) {
        return ApiResponse.fail(
                e.getErrorCode().getCode(),
                e.getErrorCode().getMessage()
        );
    }
}