package org.joe.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author QiangQiang Gu
 * @date 2020/5/31 20:12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.joe.api"})
@ComponentScan({"com.joe.api","org.joe.feign"})
public class ConsumerApplicationFeign8081 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationFeign8081.class, args);
    }
}
