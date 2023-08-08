package com.example._1_progress_be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "classA")
public class ClassA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId;

    private String name;

    private String teacher;

    @OneToMany(mappedBy = "classA")
    private List<Student> students;
}