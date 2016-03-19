package com.assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/19/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="rectDetails")
    public AreaCalculation getDetails()
    {
        return new AreaCalculation(10.0,5.0);
    }

}
