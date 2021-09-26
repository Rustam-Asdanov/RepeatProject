package com.new_season.lesson_1_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class RunController {

    @RequestMapping("/get")
    public String getPage(){
        return "/lesson_1_1_sites/page";
    }
}
