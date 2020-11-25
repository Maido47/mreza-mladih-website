package com.example.springboot_web_app_with_login.repository;

import com.example.springboot_web_app_with_login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
