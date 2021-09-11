package com.lesson.annotationLesson;

public class Songs {

    private MusicTypes theMusicTypes;

    public Songs(MusicTypes theMusicTypes) {
        this.theMusicTypes = theMusicTypes;
    }

    public void getSongName(){
        System.out.println("Song: " + theMusicTypes.getSong());
    }
}
