package com.lesson.homeworkFour.peopleDependency;

public class Money implements HumanDependency{
    @Override
    public String getDependency() {
        return "Я хочу 10.000.000 долларов.";
    }
}
