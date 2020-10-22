package com.cybertek.services;

import com.cybertek.interfaces.Course;
import interfaces.ExtraSession;
import lombok.Data;

@Data
public class Selenium implements Course {

    public void getTeachingHours() {
        System.out.println("Selenium classes hours: 15" );
    }

}
