package com.xzh.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: siu
 * @Date: 2019/3/19 14:44
 */
@Slf4j
@RestController
@RefreshScope
public class TestController {

    @Value("${mynacos.title}")
    private String title;


    @GetMapping("test")
    public String test() {
        return title;
    }

}
