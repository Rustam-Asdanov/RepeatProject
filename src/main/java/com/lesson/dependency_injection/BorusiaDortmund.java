package com.lesson.dependency_injection;

public class BorusiaDortmund implements FootballClubs{
    @Override
    public String getPlayerName() {
        return "Torgan Hazard";
    }

    @Override
    public String getPlayerCost() {
        return "45.000.000$";
    }
}
