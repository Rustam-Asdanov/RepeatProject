package com.lesson.multyDependency.CarService;

public class Wheels implements Service{
    @Override
    public String getReadyStatus() {
        return "Wheels are ready!";
    }
}
