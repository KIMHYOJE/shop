package com.example.shop.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("USER4001", "유저를 찾을 수 없습니다"),
    PRODUCT_NOT_FOUND("PRODUCT4001", "상품을 찾을 수 없습니다"), // 4주차 과제 예시
    INVALID_REQUEST("COMMON400", "잘못된 요청입니다");

    private final String code;
    private final String message;
}