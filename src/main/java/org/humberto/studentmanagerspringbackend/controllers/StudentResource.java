package org.humberto.studentmanagerspringbackend.controllers;

import org.humberto.studentmanagerspringbackend.model.Student;
import org.humberto.studentmanagerspringbackend.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "https://student-manager-frontend-61c42.web.app/")
public class StudentResource {

    //attributes
    private final StudentService studentService;

    //constructor
    @Autowired
    public StudentResource(StudentService studentService) {

        this.studentService = studentService;
    }

    //methods
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(
                this.studentService.findAllStudents(), HttpStatus.OK
        );
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {

        return new ResponseEntity<>(
                this.studentService.findStudentById(id),
                HttpStatus.OK
        );
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {

        return new ResponseEntity<>(
                this.studentService.addStudent(student),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {

        return new ResponseEntity<>(
                this.studentService.updateStudent(student),
                HttpStatus.OK
        );
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long id) {

        this.studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
