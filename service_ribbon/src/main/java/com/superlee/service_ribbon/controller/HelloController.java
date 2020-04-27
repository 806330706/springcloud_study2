package com.superlee.service_ribbon.controller;

import com.superlee.service_ribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloRibbonService helloRibbonService;

    @RequestMapping("/hi")
    public String hello(String name){
        System.out.println("nnnnnnnnnnnn"+name);
        return helloRibbonService.getRemoteHello(name);
    }




}
