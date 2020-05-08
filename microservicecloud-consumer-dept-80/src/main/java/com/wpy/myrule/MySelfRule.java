package com.wpy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        // 默认是轮训，修改为随机
//        return new RandomRule();
        // 自定义策略
        return new RandomRule_ZY();
    }

}
