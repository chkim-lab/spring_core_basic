package com.spring.core.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import singleton.StatefulService;

@Configuration
public class Testconfig {

    @Bean
    public StatefulService statefulService() {
        return new StatefulService();
    }
}
