package com.services;

import com.cybertek.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    public int getHours() {
       return 5;
    }
}
