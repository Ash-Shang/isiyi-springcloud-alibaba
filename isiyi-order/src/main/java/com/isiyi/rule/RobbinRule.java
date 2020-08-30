package com.isiyi.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RobbinRule {

    @Bean
    public IRule myRule(){
        //随机
        return new RandomRule();
    }

}
