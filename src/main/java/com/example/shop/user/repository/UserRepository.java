package com.example.shop.user.repository;

import com.example.shop.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository를 상속받아 save, findById 등 기본 기능 사용 [12]
}