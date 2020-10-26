package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Java implements Course {

    //field injection
    @Autowired
    private  OfficeHours officeHours;

    //Constructor Injection
   /* @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/

    //Setter injector
/*@Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }*/

    @Override
    public void getTeachingHours() {
        System.out.println("Java hours: "+ (20+officeHours.getHours()));
    }
}
