package com.lesson.homeworkFour.people;

import com.lesson.homeworkFour.peopleDependency.HumanDependency;

public class Teens implements Human{

    private HumanDependency theHumanDependency;

    public Teens(HumanDependency theHumanDependency) {
        this.theHumanDependency = theHumanDependency;
    }

    @Override
    public void getHumanDependency() {
        System.out.println("У подростков: " + theHumanDependency.getDependency());
    }
}
