package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {
    @Value("JD1")
    private  String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

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
