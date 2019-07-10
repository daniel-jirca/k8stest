package com.qualitance.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanDefinitions {

    @Bean
    @RefreshScope
    @Scope(scopeName = "singleton")
    MyBean myBean() {
        return new MyBean();
    }
}
