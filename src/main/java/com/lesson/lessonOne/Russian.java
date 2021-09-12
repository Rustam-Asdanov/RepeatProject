package com.lesson.lessonOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Russian implements Language{

    @Value("${lessonOne.russianWord}")
    private String russianWord;
//    russianWord="Игрушка"

    @Override
    public String word() {
        return russianWord;
    }
}
