package com.REY.FirstApp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping("/greeting")
    public String greet() {
        log.info("About to make some greeting");
        return "Hello World";
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        log.info("About to make call for students");
        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        log.info("About to add student: {}",student);
        return new ResponseEntity<>(service.addStudent(student), HttpStatus.CREATED);
    }
}
