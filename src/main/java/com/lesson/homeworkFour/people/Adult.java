package com.lesson.homeworkFour.people;

import com.lesson.homeworkFour.peopleDependency.HumanDependency;

public class Adult implements Human{

    private HumanDependency theHumanDependency;

    public Adult() {
    }

    public Adult(HumanDependency theHumanDependency) {
        this.theHumanDependency = theHumanDependency;
    }

    @Override
    public void getHumanDependency() {
        System.out.println("У взрослых: " + theHumanDependency.getDependency());
    }
}
