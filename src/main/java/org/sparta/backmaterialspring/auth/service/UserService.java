package org.sparta.backmaterialspring.auth.service;

import org.sparta.backmaterialspring.auth.dto.CreateUserDto;
import org.sparta.backmaterialspring.auth.dto.SignupResponseDto;

public interface UserService {
    SignupResponseDto signup(CreateUserDto createUserDto);
}
