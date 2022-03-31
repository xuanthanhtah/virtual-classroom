package com.virtualclassroom;

import com.virtualclassroom.model.Role;
import com.virtualclassroom.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@AutoConfigureDataJpa
@Rollback(false)
public class RoleRepositoryTest {
    @Autowired
    RoleRepository roleRepository;

    @Test
    public void testCreateNewRole() {
        Role user = new Role("USER");
        Role admin = new Role("ADMIN");
        Role student = new Role("STUDENT");
        Role teacher = new Role("TEACHER");

        roleRepository.saveAll(List.of(user, admin, student, teacher));
        assertThat(roleRepository.findAll().size(), equalTo(4));
    }
}
