package com.lesson.lessonOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WordWorld {

    @Autowired
    @Qualifier("russian")
    private Language language;

    public void getWord(){
        System.out.println("My word: " + language.word());
    }
}
