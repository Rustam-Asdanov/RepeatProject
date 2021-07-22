package com.lesson.multyDependency.SomeCars;

import com.lesson.multyDependency.CarService.Service;

public class Germany implements Cars{
    private Service theService;

    public Germany(Service theService) {
        this.theService = theService;
    }

    @Override
    public String getCarName() {
        return "Mercedes\n " +
                "Service sent message: " + theService.getReadyStatus();
    }
}
