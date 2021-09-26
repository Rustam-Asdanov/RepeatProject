package com.lesson.homework_8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AzeriNames implements HumanNames{

    @Value("${name.three.male}")
    private String nameMale;

    @Value("${name.three.female}")
    private String nameFemale;


    @Override
    public String getNameMale() {
        return nameMale;
    }

    @Override
    public String getNameFemale() {
        return nameFemale;
    }
}
