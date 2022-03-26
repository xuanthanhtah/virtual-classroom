package com.virtualclassroom.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Homework {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClass;
    private Long idHomeWork;

    @ManyToMany()
    @JoinTable(name = "UserClass",
            joinColumns = @JoinColumn(name = "workId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "id"))
    private Set<Classroom> classrooms = new HashSet<>();

    public Homework() {

    }

    public Homework(Long idClass, Long idHomeWork) {
        this.idClass = idClass;
        this.idHomeWork = idHomeWork;
    }

    public Long getIdClass() {
        return idClass;
    }

    public void setIdClass(Long idClass) {
        this.idClass = idClass;
    }

    public Long getIdHomeWork() {
        return idHomeWork;
    }

    public void setIdHomeWork(Long idHomeWork) {
        this.idHomeWork = idHomeWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return Objects.equals(idClass, homework.idClass) && Objects.equals(idHomeWork, homework.idHomeWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClass, idHomeWork);
    }
}
