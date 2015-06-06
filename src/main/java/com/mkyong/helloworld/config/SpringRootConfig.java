package com.mkyong.helloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.mkyong.helloworld.service" })
public class SpringRootConfig {
}