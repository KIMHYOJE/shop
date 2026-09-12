package com.example.shop.user.entity;

import com.example.shop.orders.entity.Orders;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity // DB 테이블과 매핑 [7]
@Getter // Getter 자동 생성 [7]
@AllArgsConstructor // 모든 필드 생성자 [7]
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA용 기본 생성자 [7]
@Table(name = "user") // 실제 테이블 명 지정 [7]
public class User {
    @Id // PK 지정 [8]
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 [8]
    private Long id;

    private String name;

    @Column(unique = true) // 이메일 중복 허용 안 함 [8]
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 양방향 연관관계: 주문 목록 조회를 위해 설정 [6]
    @OneToMany(mappedBy = "user") // 관계의 주인인 Orders의 user 필드와 매핑 [6]
    private List<Orders> orders = new ArrayList<>();

    // 상태 변경 메서드 (의도를 가진 메서드 사용 권장) [9, 10]
    public void updateEmail(String email) {
        this.email = email;
        this.updatedAt = LocalDateTime.now();
    }
}