package com.lesson.homeworkFive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Company theCompanyTwo = new Company();
//        Company theCompany = context.getBean("company", Company.class);
//
//        theCompany.getInfo();
//
//        FootballPlayer thePlayer = context.getBean("player",FootballPlayer.class);
//        thePlayer.getInfo();

        Movies theMoive;
//        theMoive = new Movies(new Detective());
        theMoive = context.getBean("movie",Movies.class);

        theMoive.getMovieName();

        context.close();
    }
}
