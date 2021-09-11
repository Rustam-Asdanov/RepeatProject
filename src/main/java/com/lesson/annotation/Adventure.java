package com.lesson.annotation;

import org.springframework.stereotype.Component;

@Component
public class Adventure implements Games{
    @Override
    public String getNameOfGame() {
        return "Far Cry 3";
    }
}
