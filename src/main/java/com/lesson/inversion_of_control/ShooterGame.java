package com.lesson.inversion_of_control;

public class ShooterGame implements Games{
    @Override
    public String getGameName() {
        return "Call of Duty: Modern Warfare 2";
    }
}
