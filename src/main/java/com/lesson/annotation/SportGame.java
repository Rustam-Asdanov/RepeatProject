package com.lesson.annotation;

import org.springframework.stereotype.Component;

@Component
public class SportGame implements Games{
    @Override
    public String getNameOfGame() {
        return "Pes 2021";
    }
}
