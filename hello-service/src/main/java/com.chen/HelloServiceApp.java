package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * HelloService应用程序入口
 * <p>
 * @Author LeifChen
 * @Date 2019/11/21
 */
@SpringBootApplication
@EnableEurekaClient
public class HelloServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApp.class, args);
    }

}
