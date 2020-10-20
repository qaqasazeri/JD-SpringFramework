package services;

import interfaces.ExtraSession;

public class OfficeHours implements ExtraSession {
    @Override
    public int getOfficeHOurs() {
        return 5;
    }
}
