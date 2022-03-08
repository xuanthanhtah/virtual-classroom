package com.virtualclassroom.repository;

import com.virtualclassroom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT user FROM User user WHERE user.userEmail = ?1")
    User findByEmail(String email);

    @Query("SELECT user FROM User user WHERE user.userName = ?1")
    User findByUsername(String username);
}
