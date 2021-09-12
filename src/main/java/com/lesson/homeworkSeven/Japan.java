package com.lesson.homeworkSeven;

import org.springframework.stereotype.Component;

@Component
public class Japan implements Language{

    @Override
    public String word() {
        return "arigato";
    }
}
