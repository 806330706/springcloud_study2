package com.superlee.service_ribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Service
@FeignClient(name="service-hello",fallback = Feedback.class)
public interface HelloFeignService {
    @RequestMapping(value = "/hi", method = GET)
    String getRemoteHello(@RequestParam("name") String name);
}

