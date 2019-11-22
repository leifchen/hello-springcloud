package com.chen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloRemote
 * <p>
 * @Author LeifChen
 * @Date 2019-11-22
 */
@FeignClient(name= "producer-service")
public interface HelloRemote {

    /**
     * hello
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}