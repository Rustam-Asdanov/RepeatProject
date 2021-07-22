package com.lesson.homeworkThree;

public class WordWorld {
    private Languages languages;

    public WordWorld(Languages languages) {
        this.languages = languages;
    }

    public void yourWord(){
        System.out.println("Your word is: " + languages.getSomeWord());
    }
}
