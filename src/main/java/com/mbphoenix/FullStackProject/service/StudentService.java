package com.mbphoenix.FullStackProject.service;

import com.mbphoenix.FullStackProject.exception.StudentAlreadyExistsException;
import com.mbphoenix.FullStackProject.model.Student;
import com.mbphoenix.FullStackProject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {

        if(studentAlreadyExists(student.getEmail())){
            throw new StudentAlreadyExistsException(student.getEmail()+"already exist!");
        }

        return studentRepository.save(student);
    }

    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();

    }


    @Override
    public Student updateStudent(Student student, Long id) {
        return null;
    }

    @Override
    public Student getStudenBytId(Long id) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
