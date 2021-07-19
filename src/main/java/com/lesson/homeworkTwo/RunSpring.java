package com.lesson.homeworkTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ChooseCountry myCountry = context.getBean("myCountry", ChooseCountry.class);

        myCountry.getCity();

        context.close();

        // example

//        Country country = new Germany();
//
//        ChooseCountry theCountryOne = new ChooseCountry();
//        theCountryOne.setCountry(country);
    }
}
