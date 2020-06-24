package org.joe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author QiangQiang Gu
 * @date 2020/5/28 8:57
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7003.class,args);
    }
}
