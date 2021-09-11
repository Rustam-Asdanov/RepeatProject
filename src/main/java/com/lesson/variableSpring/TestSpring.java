package com.lesson.variableSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Human humanOne;
//        humanOne = new Human();
//        humanOne.setName("Mark");
//        humanOne.setCountry("England");
//        humanOne.setBirthday("21 august");
//        humanOne.setSalary("1000 $");

        humanOne = context.getBean("human", Human.class);

        System.out.println(humanOne.getName());
        System.out.println(humanOne.getCountry());
        System.out.println(humanOne.getBirthday());
        System.out.println(humanOne.getSalary());


        context.close();
    }
}
