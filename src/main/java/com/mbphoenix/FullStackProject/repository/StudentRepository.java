package com.mbphoenix.FullStackProject.repository;

import com.mbphoenix.FullStackProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


    boolean findByEmail(String email);
}
