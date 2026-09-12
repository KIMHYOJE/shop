package com.example.shop.product.service;

import com.example.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional // 로직 수행의 원자성을 보장합니다.
public class ProductService {
    private final ProductRepository productRepository;
}