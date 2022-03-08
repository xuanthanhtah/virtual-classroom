package com.virtualclassroom.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameClass;

    private String descriptionClass;

    private String codeClass;

    @ManyToMany(mappedBy = "classrooms")
    private Set<User> users = new HashSet<>();

    public Classroom() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getDescriptionClass() {
        return descriptionClass;
    }

    public void setDescriptionClass(String descriptionClass) {
        this.descriptionClass = descriptionClass;
    }

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom aClassroom = (Classroom) o;
        return id == aClassroom.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
