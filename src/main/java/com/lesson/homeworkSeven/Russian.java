package com.lesson.homeworkSeven;

import org.springframework.stereotype.Component;

@Component
public class Russian implements Language{
    @Override
    public String word() {
        return "космос";
    }
}
