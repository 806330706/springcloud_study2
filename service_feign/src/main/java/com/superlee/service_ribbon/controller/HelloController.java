package com.superlee.service_ribbon.controller;

import com.superlee.service_ribbon.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping("/hi")
    public String hello(String name){
        System.out.println("nnnnnnnnnnnn"+name);
        return helloFeignService.getRemoteHello(name);
    }




}
