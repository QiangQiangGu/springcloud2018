package org.joe.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author QiangQiang Gu
 * @date 2020/5/27 19:30
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication8080.class,args);
    }
}

