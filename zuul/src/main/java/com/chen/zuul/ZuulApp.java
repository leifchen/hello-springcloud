package com.chen.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul应用程序入口
 * <p>
 * @Author LeifChen
 * @Date 2019-11-21
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class, args);
    }
}
