package com.virtualclassroom.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Homework {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long classId;

    @ManyToMany()
    @JoinTable(name = "HomeworkUser",
            joinColumns = @JoinColumn(name = "homeWorkId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"))
    private Set<Classroom> classrooms = new HashSet<>();

    public Homework() {}
    public Homework(Long classId) {
        this.classId = classId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return Objects.equals(Id, homework.Id) && Objects.equals(classId, homework.classId) && Objects.equals(classrooms, homework.classrooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, classId, classrooms);
    }
}
