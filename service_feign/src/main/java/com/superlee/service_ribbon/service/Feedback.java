package com.superlee.service_ribbon.service;

import org.springframework.stereotype.Component;

@Component
public class Feedback implements HelloFeignService {
    @Override
    public String getRemoteHello(String name) {
        return "error:"+name;
    }
}
