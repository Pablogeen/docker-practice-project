package com.REY.FirstApp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        log.info("About to make students call");
        List<Student> students = studentRepo.findAll();
        return students;
    }

    public Student addStudent(Student student) {
        log.info("Student is about to be recorded: {}",student);
        Student savedStudent = studentRepo.save(student);
        return savedStudent;
    }
}
