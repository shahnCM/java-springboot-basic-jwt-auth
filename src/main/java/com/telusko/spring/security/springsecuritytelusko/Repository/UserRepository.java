package com.telusko.spring.security.springsecuritytelusko.Repository;

import com.telusko.spring.security.springsecuritytelusko.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
