package com.lesson.homeworkTwo;

public class ChooseCountry {
    private Country country;

//    public ChooseCountry(Country country){
//        this.country = country;
//    }


    public void setMyLovelyCountry(Country country) {
        this.country = country;
    }

    public void getCity(){
        System.out.println("Your choice : " + country.getCityName());
    }
}
