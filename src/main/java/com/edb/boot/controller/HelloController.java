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


//        List<Product> productList =
//                Arrays.asList(new Product(23, "potatoes"),
//                        new Product(14, "orange"),
//                        new Product(13, "lemon"),
//                        new Product(23, "bread"),
//                        new Product(13, "sugar"));
//        System.out.println(productList.stream().collect(Collectors.summarizingInt(Product::getAmount)));
        return result;
    }


}