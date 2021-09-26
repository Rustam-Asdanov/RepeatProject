package com.lesson.homework_8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnglishNames implements HumanNames{

    @Value("${name.one.male}, ${name.two.male}")
    private String[] nameMale;

    @Value("${name.one.female}, ${name.two.female}")
    private String[] nameFemale;

    @Override
    public String getNameMale() {
        return nameMale[0];
    }

    @Override
    public String getNameFemale() {
        return nameFemale[0];
    }
}
