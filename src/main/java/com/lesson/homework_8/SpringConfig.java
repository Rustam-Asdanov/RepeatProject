package com.lesson.homework_8;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lesson.homework_8")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
