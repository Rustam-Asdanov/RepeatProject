package com.lesson.inversion_of_control;

public class AdventureGame implements Games{
    @Override
    public String getGameName() {
        return "Sims 4";
    }
}
