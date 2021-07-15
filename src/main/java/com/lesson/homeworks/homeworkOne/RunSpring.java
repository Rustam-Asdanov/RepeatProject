package com.lesson.homeworks.homeworkOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Company theCompany;
//        theCompany = new KFC();
//        theCompany = new PapaJones();
//        theCompany = new MacDonalds();
        theCompany = context.getBean("company",Company.class);

        OnlineOrder myOrder = new OnlineOrder(theCompany);

        myOrder.getOrder();
    }
}
