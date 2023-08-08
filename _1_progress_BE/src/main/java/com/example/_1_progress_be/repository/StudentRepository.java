package com.example._1_progress_be.repository;

import com.example._1_progress_be.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}