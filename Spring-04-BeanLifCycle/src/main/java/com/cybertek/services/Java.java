package com.cybertek.services;

import com.cybertek.interfaces.Course;

import java.util.Collections;

public class Java implements Course {
    public void getTeachingHours() {
        System.out.println("Java classes hours: 20" );
    }

    public void myInitMethod(){
        System.out.println("Executing init method");
    }
    public void myDestroyMethod(){
        System.out.println("Executing destroy method");
    }
}
