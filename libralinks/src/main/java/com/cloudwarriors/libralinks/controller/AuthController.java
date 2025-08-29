package com.cloudwarriors.libralinks.controller;

import com.cloudwarriors.libralinks.model.User;
import com.cloudwarriors.libralinks.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestParam String username, @RequestParam String password) {
        return userService.register(username, password);
    }

    @GetMapping("/login")
    public String login() {
        return "Login endpoint handled by Spring Security";
    }
}
