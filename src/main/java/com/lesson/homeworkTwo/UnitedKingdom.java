package com.lesson.homeworkTwo;

import java.util.Random;

public class UnitedKingdom implements Country{
    @Override
    public String getCityName() {
        Random random = new Random();

        String[] city = {"London", "Glasgow", "Edinburgh"};

        int randomNum = random.nextInt(city.length);

        return city[randomNum];
    }
}
