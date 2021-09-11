package com.lesson.homeworkFour.peopleDependency;

public class IceCream implements HumanDependency{
    @Override
    public String getDependency() {
        return "Я хочу мароженное ванильное с клубникой.";
    }
}
