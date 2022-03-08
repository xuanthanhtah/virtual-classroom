package com.virtualclassroom;

import com.virtualclassroom.model.User;
import com.virtualclassroom.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
public class VirtualClassroomApplication{

    public static void main(String[] args) {
        SpringApplication.run(VirtualClassroomApplication.class, args);
    }

}