package com.example.TwitterApp.core.config;

import com.example.TwitterApp.core.service.Service;
import com.example.TwitterApp.core.service.Validator;
import com.example.TwitterApp.core.service.interfaces.IValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.example.TwitterApp.core.service"})
@PropertySource("application.properties")
public class ApplicationConfig {

    @Bean
    public IValidator getValidator() {
        return new Validator("John",
                "Doe");
    }
}
