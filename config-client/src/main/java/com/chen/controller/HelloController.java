package com.chen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * <p>
 * @Author LeifChen
 * @Date 2019-11-25
 */
@RestController
public class HelloController {

    @Value("${test.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
