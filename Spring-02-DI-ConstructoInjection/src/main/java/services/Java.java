package services;

import interfaces.Course;
import interfaces.ExtraSession;

public class Java implements Course {
  ExtraSession extraSession;
    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getHours() {
        System.out.println("Java classes hours:"+ (20+extraSession.getOfficeHOurs()) );
    }
}
