package com.example.shop.product.repository;

import com.example.shop.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository를 상속받아 기본적인 CRUD 기능을 제공받습니다 [7].
}