package com.chen.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * <p>
 * @Author LeifChen
 * @Date 2019-11-21
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String test() {
        return "Hello Spring Cloud";
    }
}
