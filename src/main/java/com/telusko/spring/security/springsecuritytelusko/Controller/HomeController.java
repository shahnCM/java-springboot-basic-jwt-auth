package com.telusko.spring.security.springsecuritytelusko.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() { return ("WELCOME"); }

    @GetMapping("/home")
    public String home() {
        return "HOME";
    }

    @GetMapping("/user")
    public String user() {
        return "USER";
    }

    @GetMapping("/admin")
    public String admin() {
        return "ADMIN";
    }

}
