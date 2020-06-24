package com.joe.dep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Hello World
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.joe.dep.dao"})
@EnableEurekaClient
@EnableDiscoveryClient
public class DepConfigApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(DepConfigApplication8001.class, args);
    }
}
