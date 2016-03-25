package com.plk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/25/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="Laptop")
    public Printer getService()
    {
        return new Laptop();
    }
}
