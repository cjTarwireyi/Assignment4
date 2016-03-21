package com.liskovs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/21/16.
 */
@Configuration
public class AppConfig {
    @Bean(name ="squareDetails")
    public Shape getSquareDetails()
    {
        return new Square(4.0);
    }
    @Bean(name="rectDetails")
    public Shape getRectDetails()
    {
        return new Rectangle(5.0,6.0);
    }
}
