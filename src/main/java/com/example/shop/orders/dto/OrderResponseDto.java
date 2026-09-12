package com.example.shop.orders.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderResponseDto {
    private Long orderId;
    private Integer totalPrice;
    private String status;
}