package com.ocp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/21/16.
 */

@Configuration
public class AppConfig {
    @Bean(name="rectatangleArea")
    public AreaCalculation getRectArea()
    {
        return new Rectangle(10.0,5.0);
    }
    @Bean(name="triAngleArea")
    public AreaCalculation getTriangleArea()
    {
        return new Triangle(5.0,3.0);
    }


}
