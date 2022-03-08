package com.virtualclassroom.service.user;

import com.virtualclassroom.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User findByUsername(String username);
    User findByEmail(String username);
}

