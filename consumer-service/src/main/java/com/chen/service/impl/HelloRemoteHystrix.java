package com.chen.service.impl;

import com.chen.service.HelloRemote;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloRemoteHystrix
 * <p>
 * @Author LeifChen
 * @Date 2019-11-25
 */
@Service
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed!";
    }
}
