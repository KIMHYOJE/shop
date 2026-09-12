package com.example.shop.orders.controller;

import com.example.shop.orders.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    @PostMapping
    public String placeOrder() {
        // 서비스로 요청 전달 및 결과 반환
        return "주문이 완료되었습니다.";
    }
}