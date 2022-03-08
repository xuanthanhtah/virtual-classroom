package com.virtualclassroom.service;

import com.virtualclassroom.model.User;
import com.virtualclassroom.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}

