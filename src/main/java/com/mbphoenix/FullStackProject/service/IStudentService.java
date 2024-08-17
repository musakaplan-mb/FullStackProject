package com.mbphoenix.FullStackProject.service;

import com.mbphoenix.FullStackProject.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);

    List<Student> getStudents();

    Student updateStudent(Student student, Long id);

    Student getStudenById(Long id);

    void deleteStudent(Long id);


}
