package com.lesson.homeworkFive;

public class Company {
    private Country theCountry;

    public void setTheCountry(Country theCountry) {
        this.theCountry = theCountry;
    }

    public void getInfo(){
        System.out.println("Наша компания из: " +theCountry.getName());
    }
}
