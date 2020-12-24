package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;
import interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

  /* @Autowired
   @Qualifier("officeHours")*/
    private ExtraSessions extraSession;

    @Autowired
    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java hours:"+(20+extraSession.getHours()));
    }
}
