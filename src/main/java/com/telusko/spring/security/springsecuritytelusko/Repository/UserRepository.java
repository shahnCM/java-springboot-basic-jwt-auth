package com.telusko.spring.security.springsecuritytelusko.Repository;

import com.telusko.spring.security.springsecuritytelusko.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
