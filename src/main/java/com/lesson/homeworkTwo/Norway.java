package com.lesson.homeworkTwo;

import java.util.Random;

public class Norway implements Country{
    @Override
    public String getCityName() {
        Random random = new Random();

        String[] city = {"Oslo", "Tromso", "Bergen"};

        int randomNum = random.nextInt(city.length);

        return city[randomNum];
    }
}
