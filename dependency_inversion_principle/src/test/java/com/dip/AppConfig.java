package com.dip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/22/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="BirdMovement")
    public BirdMovement getBirdMovement()
    {
        return  new BirdMovement();
    }
    @Bean(name="ostrich")
    public Ostrich getOstrich()
    {
        return new Ostrich();
    }
}
