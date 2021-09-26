package com.lesson.homework_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WeddingClass {

    @Autowired
    @Qualifier("englishNames")
    private HumanNames humanNamesOne;

    @Autowired
    @Qualifier("azeriNames")
    private HumanNames humanNamesTwo;


    public void getInfo(){
        System.out.println( humanNamesOne.getNameMale() + " and " + humanNamesTwo.getNameFemale() + " just married" );
    }
}
