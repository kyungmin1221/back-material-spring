package org.sparta.backmaterialspring.auth.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.auth.dto.CreateUserDto;
import org.sparta.backmaterialspring.auth.dto.SignupResponseDto;
import org.sparta.backmaterialspring.auth.service.AuthService;
import org.sparta.backmaterialspring.auth.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @Operation(summary = "회원가입")
    @PostMapping("/signup")
    public ResponseEntity<SignupResponseDto> signup(@RequestBody CreateUserDto createUserDto) {
        SignupResponseDto responseDto = userService.signup(createUserDto);
        return ResponseEntity.ok(responseDto);
    }

}
