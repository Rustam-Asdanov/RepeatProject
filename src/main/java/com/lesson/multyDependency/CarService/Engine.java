package com.lesson.multyDependency.CarService;

public class Engine implements Service{
    @Override
    public String getReadyStatus() {
        return "Engine is ready!";
    }
}
