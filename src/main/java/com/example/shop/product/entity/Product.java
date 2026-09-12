package com.example.shop.product.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity // DB 테이블과 매핑되는 객체 [4]
@Getter // 모든 필드의 Getter 자동 생성 [4]
@AllArgsConstructor // 모든 필드를 포함한 생성자 생성 [4]
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA 필수 기본 생성자 [4]
@Table(name = "product") // 실제 DB의 product 테이블과 연결 [4]
public class Product {
    @Id // PK 지정 [5]
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 [5]
    private Long id;

    private String name;
    private Integer price;
    private Integer stock; // 상품 재고 (ERD 기반)

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}