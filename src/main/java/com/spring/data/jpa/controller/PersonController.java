package com.spring.data.jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
//    заменить на метод который описан в задании
    @RequestMapping("/")
    public String save() {
        return "Hello World";
    }
}
