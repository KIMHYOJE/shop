package com.example.shop.user.dto.request;

public record CreateUserRequest(
        String name,
        String email
) {}