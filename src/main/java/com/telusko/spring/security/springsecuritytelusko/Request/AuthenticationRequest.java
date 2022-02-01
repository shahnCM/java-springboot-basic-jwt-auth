package com.telusko.spring.security.springsecuritytelusko.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
}
