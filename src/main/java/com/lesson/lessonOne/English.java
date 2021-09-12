package com.lesson.lessonOne;

import org.springframework.stereotype.Component;

@Component
public class English implements Language{

    @Override
    public String word() {
        return "car";
    }
}
