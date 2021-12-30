package com.edb.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HashMap hello() {
        HashMap result = new HashMap();
        result.put("message", "hello?");

        return result;
    }


}