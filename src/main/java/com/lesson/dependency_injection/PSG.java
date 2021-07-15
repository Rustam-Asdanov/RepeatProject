package com.lesson.dependency_injection;

public class PSG implements FootballClubs{
    @Override
    public String getPlayerName() {
        return "Neymar";
    }

    @Override
    public String getPlayerCost() {
        return "250.000.000$";
    }
}
