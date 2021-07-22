package com.lesson.multyDependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CarCompany myCar = context.getBean("myCar", CarCompany.class);

        myCar.getCar();

        context.close();
    }
}
