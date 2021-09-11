package com.lesson.homeworkSix;

import org.springframework.stereotype.Component;

@Component
public class ManchesterUnited implements Clubs{
    @Override
    public void getPlayers() {
        System.out.println("Cristiano Ronaldo - 7");
    }
}
