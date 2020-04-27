package com.superlee.service_ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String getRemoteHello(String name){
        return restTemplate.getForObject("http://SERVICE-HELLO/hi?name="+name,String.class);
    }
}
