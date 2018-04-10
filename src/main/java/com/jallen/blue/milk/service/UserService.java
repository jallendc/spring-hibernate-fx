package com.jallen.blue.milk.service;

import java.util.List;

import com.jallen.blue.milk.entity.User;

public interface UserService {
    void save(User user);
    List<User> listUsers();
}
