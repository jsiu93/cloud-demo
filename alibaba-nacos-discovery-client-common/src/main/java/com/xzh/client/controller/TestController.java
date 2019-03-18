package com.xzh.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: siu
 * @Date: 2019/3/18 17:21
 */
@Slf4j
@RestController
public class TestController {


    @Autowired
    LoadBalancerClient loadBalancerClient;




    @GetMapping("test")
    public String test() {

        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");

        String s = serviceInstance.getUri() + "/hello?name=" + "aaaaa";

        RestTemplate restTemplate = new RestTemplate();
        String object = restTemplate.getForObject(s, String.class);

        return "invoke: " + s + ", return: " + object;

    }

}
