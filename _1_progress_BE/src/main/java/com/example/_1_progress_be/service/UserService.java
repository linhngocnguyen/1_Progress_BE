package com.example._1_progress_be.service;

import com.example._1_progress_be.dto.UserDto;
import com.example._1_progress_be.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
