package com.chen.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerApp应用程序入口
 * <p>
 * @Author LeifChen
 * @Date 2019/11/21
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
	}
}
