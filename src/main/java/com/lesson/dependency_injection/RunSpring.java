package com.lesson.dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){

        /**
         * Spring way
         */
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // inversion of control method
//        FootballClubs myClub =
//                context.getBean("myClub",FootballClubs.class);
//
//        TransferMarket myTransfer = new TransferMarket(myClub);

        // dependency injection method

        TransferMarket myTransfer =
                context.getBean("myTransfer",TransferMarket.class);

        myTransfer.yourPurchase();


        context.close();

        /**
         * Simple way
         */
//        FootballClubs myClub = new PSG();
//
//        TransferMarket mytransfer = new TransferMarket(myClub);
//
//        mytransfer.yourPurchase();

    }
}
