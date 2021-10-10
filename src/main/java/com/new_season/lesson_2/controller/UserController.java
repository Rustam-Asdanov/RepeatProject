package com.new_season.lesson_2.controller;

import com.new_season.lesson_2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page-model")
public class UserController {

    @RequestMapping
    public String getPage(Model model){

        model.addAttribute("user",new User());

        return "lesson_2/main_model";
    }

    @RequestMapping("/add")
    public String getData(
            @ModelAttribute("user") User user_one
    ){

        System.out.println(user_one.getFirstName());

        return "redirect:/page-model";
    }
}
