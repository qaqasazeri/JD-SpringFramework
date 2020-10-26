package com.cybertek.services;

import com.cybertek.interfaces.ExtraSessions;
import interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 19;
    }
}
