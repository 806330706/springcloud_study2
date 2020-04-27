package com.superlee.eureka_server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hello(String name){
        if(StringUtils.isEmpty(name)){
            name="";
        }
        return "---------"+port+"say:"+"hello"+name;
    }




}
