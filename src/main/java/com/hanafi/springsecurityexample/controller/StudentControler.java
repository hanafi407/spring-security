package com.hanafi.springsecurityexample.controller;

import com.hanafi.springsecurityexample.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentControler {
    List<Student> students= new ArrayList<>(List.of(
            new Student(1,"Hanafi",60),
            new Student(2,"Dimas",70)
    ));
    @GetMapping("student")
    public List<Student> getAllStudent(){
        return students;
    }

    @PostMapping("student")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
