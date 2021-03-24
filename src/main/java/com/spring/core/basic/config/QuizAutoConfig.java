package com.spring.core.basic.config;

import com.spring.core.basic.quiz.computer.Computer;
import com.spring.core.basic.quiz.computer.KeyBoard;
import com.spring.core.basic.quiz.computer.Monitor;
import com.spring.core.basic.quiz.computer.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.basic.quiz")
public class QuizAutoConfig {

}
