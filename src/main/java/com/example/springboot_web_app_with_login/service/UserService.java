package com.example.springboot_web_app_with_login.service;

import com.example.springboot_web_app_with_login.model.User;
import com.example.springboot_web_app_with_login.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
