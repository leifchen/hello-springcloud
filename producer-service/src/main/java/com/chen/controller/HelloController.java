package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * <p>
 * @Author LeifChen
 * @Date 2019-11-22
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name;
    }
}
