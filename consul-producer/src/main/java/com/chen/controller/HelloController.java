package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * <p>
 * @Author LeifChen
 * @Date 2019-11-26
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello consul";
    }
}
