package com.jallen.blue.milk.dao;

import java.util.List;

import com.jallen.blue.milk.entity.User;

public interface UserDao {
    void save(User user);
    List<User> listUsers();
}
