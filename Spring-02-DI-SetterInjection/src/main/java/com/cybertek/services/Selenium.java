package com.cybertek.services;

import com.cybertek.interfaces.Course;
import interfaces.ExtraSession;
import lombok.Data;

@Data
public class Selenium implements Course {

    private ExtraSession extraSession;

    public void getHours() {
        System.out.println("Selenium classes hours:"+ (15+extraSession.getOfficeHOurs()) );
    }

}
