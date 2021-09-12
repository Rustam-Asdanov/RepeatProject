package com.lesson.homeworkSeven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WordWorld {

    private Language language;

    @Autowired
    public WordWorld(@Qualifier("english") Language language) {
        this.language = language;
    }

    public void getWord(){

        System.out.println("We get: " + language.word());
    }
}
