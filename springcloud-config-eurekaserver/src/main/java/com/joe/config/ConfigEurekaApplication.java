package com.joe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author QiangQiang Gu
 * @date 2020/6/24 13:38
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaApplication.class,args);
    }
}
