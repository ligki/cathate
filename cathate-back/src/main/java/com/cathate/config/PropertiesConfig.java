package com.cathate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:errorcode.properties")
public class PropertiesConfig {
}
