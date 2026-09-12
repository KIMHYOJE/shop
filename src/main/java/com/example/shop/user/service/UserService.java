package com.example.shop.user.service;

import com.example.shop.global.exception.CustomException;
import com.example.shop.global.exception.ErrorCode;
import com.example.shop.user.dto.request.CreateUserRequest;
import com.example.shop.user.dto.request.UpdateUserRequest;
import com.example.shop.user.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    // 사용자 생성E
    public UserResponse createUser(CreateUserRequest request) {
        // 실제로는 DB 저장 로직이 들어가지만 현재는 Mock 데이터 반환
        return new UserResponse(1L, request.name(), request.email());
    }

    // 전체 사용자 조회
    public List<UserResponse> getUsers() {
        return List.of(
                new UserResponse(1L, "park", "park@test.com"),
                new UserResponse(2L, "kim", "kim@test.com")
        );
    }

    // 단일 사용자 조회 (수정 포인트: CustomException 사용)
    public UserResponse getUser(Long id) {
        if (id == 1L) {
            return new UserResponse(1L, "park", "park@test.com");
        }
        // 유저가 없을 경우 우리가 정의한 에러 코드를 던짐
        throw new CustomException(ErrorCode.USER_NOT_FOUND);
    }

    // 사용자 정보 수정 (수정 포인트: CustomException 사용)
    public UserResponse updateUser(Long id, UpdateUserRequest request) {
        if (id != 1L) {
            throw new CustomException(ErrorCode.USER_NOT_FOUND);
        }
        return new UserResponse(id, "park", request.email());
    }

    // 사용자 삭제 (수정 포인트: CustomException 사용)
    public void deleteUser(Long id) {
        if (id != 1L) {
            throw new CustomException(ErrorCode.USER_NOT_FOUND);
        }
    }
}