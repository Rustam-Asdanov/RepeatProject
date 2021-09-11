package com.lesson.homeworkSix;

import org.springframework.stereotype.Component;

@Component
public class PSG implements Clubs {

    @Override
    public void getPlayers() {
        System.out.println("Lionel Messi - 30");
    }
}
