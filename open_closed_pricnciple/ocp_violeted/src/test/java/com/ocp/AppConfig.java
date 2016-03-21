package com.ocp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/21/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="rectDetails")
    public Rectangle getRecDetails()
    {
        return new Rectangle(4.0,2.0);
    }
    @Bean(name="triDetails")
    public  Triangle getTriDetails()
    {
        return new Triangle(5.0,2.0);
    }
}

