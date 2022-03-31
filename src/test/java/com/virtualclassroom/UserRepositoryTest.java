package com.virtualclassroom;

import com.virtualclassroom.model.User;
import com.virtualclassroom.repository.RoleRepository;
import com.virtualclassroom.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@AutoConfigureDataJpa
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testAddRoleToUser() {
        User user = new User();
        user.setUserName("test");
        user.setUserPassword("test");
        user.setUserEmail("test@gmail.com");
        user.addRole(roleRepository.findByName("STUDENT"));

        userRepository.save(user);
        assert user.getRoles().size() == 1;
    }
}
