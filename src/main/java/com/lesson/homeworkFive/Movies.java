package com.lesson.homeworkFive;

public class Movies {

    private Types theTypes;

    public Movies(Types types){
        theTypes = types;
    }

    public void getMovieName(){
        System.out.println("We watch: " + theTypes.getName());
    }
}
