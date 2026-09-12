package com.example.shop.product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductResponseDto {
    private Long id;
    private String name;
    private Integer price;
    private Integer stock;
}