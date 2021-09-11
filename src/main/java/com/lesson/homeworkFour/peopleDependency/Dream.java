package com.lesson.homeworkFour.peopleDependency;

public class Dream implements HumanDependency{
    @Override
    public String getDependency() {
        return "Я хочу спать 10 часов, в особенности в Понедельник.";
    }
}
