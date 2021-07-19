package com.lesson.homeworkTwo;

import java.util.Random;

public class Germany implements Country{
    @Override
    public String getCityName() {
        Random random = new Random();

        String[] city = {"Berlin", "Munich", "Hamburg"};

        int randomNum = random.nextInt(city.length);

        return city[randomNum];
    }
}
