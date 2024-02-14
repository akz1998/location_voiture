package com.example.locationvoiture.service;

import com.example.locationvoiture.entity.User;

import java.util.Optional;

public interface UserService {
    public User Signup (User user);
    public Boolean login(User user);
}
