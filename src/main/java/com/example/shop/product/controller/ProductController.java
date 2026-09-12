package com.example.shop.product.controller;

import com.example.shop.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products") // 상품 관련 URL 매핑 [6]
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping // 상품 등록
    public String addProduct() { return "상품 등록 완료"; }

    @GetMapping // 상품 목록 조회
    public String getProductList() { return "상품 목록 반환"; }
}