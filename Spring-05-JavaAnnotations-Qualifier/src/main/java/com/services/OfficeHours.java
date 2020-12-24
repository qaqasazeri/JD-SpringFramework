package com.services;

import com.interfaces.ExtraSessions;
import interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 8;
    }
}
