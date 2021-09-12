package com.lesson.lessonOne;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lesson.lessonOne")
@PropertySource("classpath:application.properties")
public class SpringConfigOne {
}
