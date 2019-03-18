package com.xzh.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: siu
 * @Date: 2019/3/18 16:58
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(@RequestParam String name) {

        return "hello";
    }

}
