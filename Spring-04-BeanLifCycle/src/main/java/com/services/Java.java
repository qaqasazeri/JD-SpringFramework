package com.services;

import com.interfaces.Course;

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
