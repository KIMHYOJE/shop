package com.example.shop.user.controller;

import com.example.shop.user.dto.request.CreateUserRequest;
import com.example.shop.user.dto.request.UpdateUserRequest;
import com.example.shop.user.dto.response.UserResponse;
import com.example.shop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    // CREATE
    @PostMapping
    public UserResponse createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }
    // READ (전체)
    @GetMapping
    public List<UserResponse> getUsers() {
        return userService.getUsers();
    }
    // READ (단일)
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
    // UPDATE
    @PatchMapping("/{id}")
    public UserResponse updateUser(
            @PathVariable Long id,
            @RequestBody UpdateUserRequest request)
    {return userService.updateUser(id, request);
    }
    // DELETE
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}