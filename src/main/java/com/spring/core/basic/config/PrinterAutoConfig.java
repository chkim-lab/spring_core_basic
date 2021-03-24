package com.spring.core.basic.config;

import com.spring.core.basic.paper.Paper;
import com.spring.core.basic.paper.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.basic.paper")
public class PrinterAutoConfig {

}
