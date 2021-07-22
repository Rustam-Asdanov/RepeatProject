package com.lesson.multyDependency;

import com.lesson.multyDependency.SomeCars.Cars;

public class CarCompany {

    private Cars theCar;

    public void setTheCar(Cars theCar) {
        this.theCar = theCar;
    }

    public void getCar(){
        System.out.println("About your car: " + theCar.getCarName());
    }
}
