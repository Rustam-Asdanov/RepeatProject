package com.lesson.homeworkFour;

import com.lesson.homeworkFour.people.Human;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Human theHuman = context.getBean("humanType",Human.class);

        theHuman.getHumanDependency();

        context.close();
    }
}
