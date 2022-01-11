package com.edb.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String Hello (){
        System.out.println("hello~~~~~~~~~~~~~~~~~~~~~~~`");
    return "index";
    }
}
