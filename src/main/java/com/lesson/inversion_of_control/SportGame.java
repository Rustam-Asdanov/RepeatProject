package com.lesson.inversion_of_control;

public class SportGame implements Games{
    @Override
    public String getGameName() {
        return "FIFA 2021";
    }
}
