package com.lesson.homeworkSeven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WorkingWithValue {

    @Value("${firstName}")
    private String firstName;

    @Value("${lastName}")
    private String lastName;

    @Value("${age}")
    private int age;

    public void getValues(){
        System.out.println(
                "My name is: " + firstName + "\n" +
                        "My last name is: " + lastName + "\n" +
                        "Age: " + age
        );
    }
}
