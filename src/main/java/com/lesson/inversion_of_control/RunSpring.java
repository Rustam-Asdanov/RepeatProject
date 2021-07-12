package com.lesson.inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Games games;

//        games = new ShooterGame();
//        games = new SportGame();
//        games = new AdventureGame();

        games = context.getBean("theGame",Games.class);

        // создаём объект EpicGames
        EpicGames epicGames = new EpicGames(games);

        epicGames.getProduct();

        context.close();
    }
}
