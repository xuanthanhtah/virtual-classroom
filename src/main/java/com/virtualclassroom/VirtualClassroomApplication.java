package com.virtualclassroom;

import com.virtualclassroom.model.User;
import com.virtualclassroom.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualClassroomApplication implements CommandLineRunner {

    public VirtualClassroomApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(VirtualClassroomApplication.class, args);
    }

    private UserRepository userRepository;

    @Override
    public void run(String... args) {
        User user1 = new User("khanh1", "khanh1@gmail.com", "123456", "active");
        userRepository.save(user1);

        User user2 = new User("khanh1", "khanh1@gmail.com", "123456", "active");
        userRepository.save(user2);

        User user3 = new User("khanh1", "khanh1@gmail.com", "123456", "active");
        userRepository.save(user3);

        User user4 = new User("khanh1", "khanh1@gmail.com", "123456", "active");
        userRepository.save(user4);
    }
}