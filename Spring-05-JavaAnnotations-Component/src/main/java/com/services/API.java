package com.services;

import com.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("API hours 10");

    }
}
