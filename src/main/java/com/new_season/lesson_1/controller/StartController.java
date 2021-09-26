package com.new_season.lesson_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping
    public String getSite(){
        return "main";
    }
}
