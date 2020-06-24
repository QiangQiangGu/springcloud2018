package com.joe.hystrix01;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.servlet.http.HttpServlet;

/**
 * @author Hello World
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.joe.hystrix01.dao"})
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DepHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(DepHystrixApplication8001.class, args);
    }

    @Bean
    public ServletRegistrationBean<HttpServlet> getServlet() {
        HttpServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<HttpServlet> registrationBean = new ServletRegistrationBean<>(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
