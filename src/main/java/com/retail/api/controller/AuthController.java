package com.retail.api.controller;

import com.retail.api.dto.auth.LoginRequest;
import com.retail.api.dto.auth.LoginResponse;
import com.retail.api.entity.User;        
import com.retail.api.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        String token = authService.login(loginRequest);
        return ResponseEntity.ok(new LoginResponse(token));
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        User savedUser = authService.register(user);
        return ResponseEntity.ok("User registered successfully: " + savedUser.getUsername());
    }
}