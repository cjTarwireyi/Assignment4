package com.assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/17/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="calcWages")
    public WagesCalculation getCalculator()
    {
        return new SalesPerson();


    }
}
