package com.lesson.annotationLesson;


import org.springframework.stereotype.Component;

@Component
public class Classic implements MusicTypes{
    @Override
    public String getSong() {
        return "Bethoven - Lunar sonata";
    }

    public void getText(){
        System.out.println("Classic Music");
    }
}
