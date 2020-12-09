package com.example.springboot_web_app_with_login.service;

import com.example.springboot_web_app_with_login.model.User;
import com.example.springboot_web_app_with_login.web.dto.UserRegistrationDto;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
    List<User> getAllUsers();
    void saveUser(User User);
    User getUserById(long id);
    void deleteUserById(long id);
    Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
