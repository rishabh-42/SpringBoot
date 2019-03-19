package com.example.boot.answer1and2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/getStudent")
    public List<Student> getStudents() {

        return studentService.getStudents();

    }


       /*
    Three ways of running spring application :
    1. Run BootApplication.class directly

    2. Run 'gradle bootRun' on terminal

    3. Run 'gradle bootJar' , this will create   executable jar in 'build/libs/boot-0.0.1-SNAPSHOT.jar'
        which can be run using these options

        java -jar boot-0.0.1-SNAPSHOT.jar
        java -jar boot-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
        java -jar boot-0.0.1-SNAPSHOT.jar --server.port=8080
      */
}
