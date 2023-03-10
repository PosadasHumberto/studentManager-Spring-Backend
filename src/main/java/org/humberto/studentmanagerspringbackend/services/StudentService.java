package org.humberto.studentmanagerspringbackend.services;

import org.humberto.studentmanagerspringbackend.model.Student;
import org.humberto.studentmanagerspringbackend.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service        //indicates to Spring Beans Container that this class is a Service
public class StudentService {

    //atributes
    private final StudentRepository studentRepository;

    //constructors
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    //getters & setters


    //methods
    public Student addStudent(Student student) {

        //set a studentCode to the student received, we are not letting the user
        //set the student code in the form, it will be set autommatically with this
        // méthod which by the way, the only méthod creating student.
        student.setStudentCode(UUID.randomUUID().toString());

        //insert the student
        return this.studentRepository.save(student);
    }
}
