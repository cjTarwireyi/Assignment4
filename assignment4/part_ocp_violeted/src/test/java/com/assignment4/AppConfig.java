package com.assignment4;

import org.omg.CORBA.Object;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/20/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="triAgleDetails")
    public Triangle getTriDetails()
    {
        return new Triangle(10.0,5.0);
    }
    @Bean(name="rectDetails")
    public Rectangle getRecDetails()
    {
        return new Rectangle(2.0,3.0);
    }
    @Bean(name="areaCalc")
    public AreaCalculation getArea()
    {
        return  new AreaCalculation(new Triangle(10.0,2.0),new Rectangle(10.0,2.0));
    }


}
