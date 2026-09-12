package com.example.shop.product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductRequestDto {
    private String name;
    private Integer price;
    private Integer stock;
}