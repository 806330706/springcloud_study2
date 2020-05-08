package com.superlee.service_ribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @RequestMapping("/hi")
    public String hello(String name){
        System.out.println("nnnnnnnnnnnn"+name);
        return "";
    }




}
