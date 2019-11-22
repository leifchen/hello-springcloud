package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaClusterApp应用程序入口
 * <p>
 * @Author LeifChen
 * @Date 2019-11-22
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterApp.class, args);
    }
}
