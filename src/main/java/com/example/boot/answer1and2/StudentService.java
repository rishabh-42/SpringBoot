package com.example.boot.answer1and2;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {

        return Arrays.asList(new Student("Rishabh", "Mainpuri", 21, 12),
                new Student("Lohit", "Noida", 21, 10)

        );
    }
}
