package com.services;

import com.interfaces.Course;
import interfaces.ExtraSession;
import lombok.Data;

@Data
public class Java implements Course {

private ExtraSession extraSession;

public void getHours() {
        System.out.println("Java classes hours:"+ (20+extraSession.getOfficeHOurs()) );
    }
}
