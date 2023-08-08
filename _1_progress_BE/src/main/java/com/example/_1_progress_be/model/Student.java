package com.example._1_progress_be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private Integer studentId;

    private String name;
    private String birthday;
    private String gender;

    @ManyToOne
    private ClassA classA;

    @OneToMany(mappedBy = "student")
    private List<Registration> registrations;
}