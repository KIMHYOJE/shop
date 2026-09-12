package com.example.shop.orders.repository;

import com.example.shop.orders.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
    // JpaRepository 상속으로 기본 CRUD 기능 제공 [8]
}