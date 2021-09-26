package com.lesson.homework_8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpring {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        WeddingClass weddingClass = context.getBean("weddingClass", WeddingClass.class);

        weddingClass.getInfo();

        context.close();
    }
}
