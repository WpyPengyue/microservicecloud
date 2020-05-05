package com.wpy.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { // boot --> spring applicationContext.xml @Configuration == applicationContext.xml

//    @Bean
//    public UserService getUserService(){
//        return  new UserService();
//    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
