package com.telusko.spring.security.springsecuritytelusko.Response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthenticationResponse {
    @Getter
    private final String jwt;
}
