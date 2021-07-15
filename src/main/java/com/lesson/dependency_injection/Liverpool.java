package com.lesson.dependency_injection;

public class Liverpool implements FootballClubs{
    @Override
    public String getPlayerName() {
        return "Muhammed Salah";
    }

    @Override
    public String getPlayerCost() {
        return "175.000.000$";
    }
}
