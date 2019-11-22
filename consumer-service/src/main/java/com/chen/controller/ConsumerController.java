package com.chen.controller;

import com.chen.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsumerController
 * <p>
 * @Author LeifChen
 * @Date 2019-11-22
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}