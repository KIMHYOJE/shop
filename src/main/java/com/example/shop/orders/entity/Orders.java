package com.example.shop.orders.entity;

import com.example.shop.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA 필수 기본 생성자 [5]
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 [3]
    private Long id;

    private Integer totalPrice;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY) // 지연 로딩 설정 [4]
    @JoinColumn(name = "user_id") // 외래키 컬럼 연결 [4]
    private User user;
}