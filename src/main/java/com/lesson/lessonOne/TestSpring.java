package com.lesson.lessonOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigOne.class);

        WordWorld wordWorld = context.getBean("wordWorld",WordWorld.class);

        wordWorld.getWord();

        context.close();
    }
}
