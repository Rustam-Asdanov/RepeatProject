package com.lesson.homeworkThree;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args){
//        WordWorld myWorld = new WordWorld(new EnglishLanguage());
//
//        myWorld.yourWord();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        WordWorld myWorld = context.getBean("myWord", WordWorld.class);

        myWorld.yourWord();

        context.close();
    }

}
