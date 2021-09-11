package com.lesson.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EpicGames epicGames = context.getBean("store",EpicGames.class);

        epicGames.getGame();

        context.close();
    }
}
