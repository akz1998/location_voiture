package com.example.locationvoiture.controller;

import com.example.locationvoiture.entity.User;
import com.example.locationvoiture.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("auth")
public class UserController {
    @Autowired
    UserService userService ;
    @PostMapping("/signup")
    public User signup (@RequestBody User u){
        return  userService.Signup(u);
    }
    @PostMapping ("/login")
    public boolean login (@RequestBody User user) {
        return userService.login(user);
    }

}
