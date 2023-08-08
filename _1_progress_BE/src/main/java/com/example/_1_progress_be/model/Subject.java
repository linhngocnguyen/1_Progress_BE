package com.example._1_progress_be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectId;

    private String name;

    private int term;

    private int count;

    @OneToMany(mappedBy = "subject")
    private List<Registration> registrations;
}