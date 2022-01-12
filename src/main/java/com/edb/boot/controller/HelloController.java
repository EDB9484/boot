package com.edb.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.getName();
        return "hello" + name; //hello spring
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }
        public String setName() {
            return name;
        }
    }

}