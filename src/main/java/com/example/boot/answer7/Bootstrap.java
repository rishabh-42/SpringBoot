package com.example.boot.answer7;

import com.example.boot.answer1and2.Student;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Bootstrap {

    @EventListener(ContextRefreshedEvent.class)
    public void init(){
        // we can also initialise this data in database
        System.out.println("Initialising student domain");
        List<Student> studentList = Arrays.
                asList(new Student("Rishabh", "Mainpuri", 21, 12),
                new Student("Lohit", "Noida", 21, 10));

    }
}
