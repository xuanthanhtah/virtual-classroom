package com.virtualclassroom.repository;

import com.virtualclassroom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
