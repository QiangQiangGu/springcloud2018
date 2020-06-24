package com.joe.cloud03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Hello World
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.joe.cloud03.dao"})
@EnableEurekaClient
@EnableDiscoveryClient
public class DepApplication8003 {
    public static void main(String[] args) {
        SpringApplication.run(DepApplication8003.class, args);
    }
}
