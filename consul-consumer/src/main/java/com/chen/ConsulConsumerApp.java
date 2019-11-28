package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsulConsumerApp应用程序入口
 * <p>
 * @Author LeifChen
 * @Date 2019-11-27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApp.class, args);
    }
}
