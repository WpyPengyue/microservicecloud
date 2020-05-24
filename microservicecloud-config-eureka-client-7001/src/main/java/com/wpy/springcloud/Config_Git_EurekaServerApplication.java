package com.wpy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// EruekaServer服务器启动类，接受其他微服务注册进来
@EnableEurekaServer // Eureka @EnableEurekaServer zuul @EnableZuulProxy
public class Config_Git_EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }


}
