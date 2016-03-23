package com.isp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/23/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="Phone")
    public PhoneServices getSrvice()
    {
        return new Phone();

    }
}
