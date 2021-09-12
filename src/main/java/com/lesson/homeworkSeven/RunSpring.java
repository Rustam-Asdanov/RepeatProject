package com.lesson.homeworkSeven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        WordWorld theWordWorld = context.getBean("wordWorld",WordWorld.class);
//
//        theWordWorld.getWord();

        WorkingWithValue workingWithValue =
                context.getBean("workingWithValue",WorkingWithValue.class);

        workingWithValue.getValues();

        context.close();
    }
}
