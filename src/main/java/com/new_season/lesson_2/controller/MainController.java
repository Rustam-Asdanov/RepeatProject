package com.new_season.lesson_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/page")
public class MainController {

    @RequestMapping
    public String getPage(){
        return "lesson_2/main";
    }

    @RequestMapping("/add")
    public String getData(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastname,
            @RequestParam(name = "gender") String gender,
            @RequestParam(name = "language") String[] language,
            @RequestParam(name = "city") String city
    ){

        System.out.println("Your first name: " + firstName);
        System.out.println("Your last name: " + lastname);
        System.out.println("Your gender: " + gender);
        System.out.println("Languages: " + language[0] + " " + language[1]);
        System.out.println("City: " + city);

        return "lesson_2/main";
    }
}
