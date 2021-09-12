package com.lesson.homeworkSeven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class English implements Language{

    @Value("${english.word}")
    private String word;

    @Override
    public String word() {
        return word;
    }
}
