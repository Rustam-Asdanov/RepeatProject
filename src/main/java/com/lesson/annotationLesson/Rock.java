package com.lesson.annotationLesson;

import org.springframework.stereotype.Component;

@Component
public class Rock implements MusicTypes{
    @Override
    public String getSong() {
        return "Linkin Park - Numb";
    }

    public void getNewSong(){
        System.out.println("Rammstain");
    }
}
