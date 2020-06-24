package com.joe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author QiangQiang Gu
 * @date 2020/6/23 19:16
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig3344.class,args);
    }
}
