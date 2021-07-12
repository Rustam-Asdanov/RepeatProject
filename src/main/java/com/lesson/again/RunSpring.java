package com.lesson.again;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car myCar = context.getBean("the_car",Car.class);

        System.out.println(myCar.getName());

        Country theCountry = context.getBean("the_country",Country.class);

        System.out.println(theCountry.getName());

        new Country("");

        context.close();

    }
}
