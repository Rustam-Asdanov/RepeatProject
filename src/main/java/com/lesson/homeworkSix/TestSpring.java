package com.lesson.homeworkSix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        BayernMunich theClub = context.getBean("bayernMunich",BayernMunich.class);
//
//        theClub.getPlayer();

        Clubs theClub = context.getBean("manchesterUnited", Clubs.class);

        theClub.getPlayers();

        Clubs theClubTwo = context.getBean("PSG", Clubs.class);

        theClubTwo.getPlayers();

        context.close();
    }
}
