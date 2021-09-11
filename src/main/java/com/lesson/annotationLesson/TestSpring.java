package com.lesson.annotationLesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Classic theClassic;

//        old simple version
//        theClassic = new Classic();

        // not simple version
//        theClassic = context.getBean("text",Classic.class);

        // new version

//        theClassic = context.getBean("classic", Classic.class);
//
//        theClassic.getText();
//
//        Rock theRock = context.getBean("rock",Rock.class);
//
//        theRock.getNewSong();
//


        MusicTypes theMusicTypes = context.getBean("rock",MusicTypes.class);

        System.out.println(theMusicTypes.getSong());

        Classic theClassic = context.getBean("classic",Classic.class);

        theClassic.getText();

        context.close();

    }
}
