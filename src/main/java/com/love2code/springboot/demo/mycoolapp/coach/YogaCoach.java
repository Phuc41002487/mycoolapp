package com.love2code.springboot.demo.mycoolapp.coach;

import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practice Yoga for 1 hour";
    }
}
