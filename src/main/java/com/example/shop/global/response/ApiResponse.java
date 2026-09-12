package com.example.shop.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse<T> {
    private boolean isSuccess;
    private String code;
    private String message;
    private T result;

    // 성공 응답 [5]
    public static <T> ApiResponse<T> success(T result) {
        return new ApiResponse<>(true, "COMMON200", "성공", result);
    }

    // 실패 응답 (GlobalExceptionHandler에서 사용) [5, 6]
    public static <T> ApiResponse<T> fail(String code, String message) {
        return new ApiResponse<>(false, code, message, null);
    }
}