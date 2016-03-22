package com.dip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/22/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="doveMovement")
    public Dove getBirdMovement()
    {
        return  new Dove();
    }
    @Bean(name="ostrich")
    public Ostrich getOstrich()
    {
        return new Ostrich();
    }
}
