package com.services;

import com.interfaces.ExtraSessions;
import interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 19;
    }
}
