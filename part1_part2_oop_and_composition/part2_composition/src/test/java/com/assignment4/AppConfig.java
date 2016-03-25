package com.assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/19/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="monthlyWages")
    public WagesCalculation getSalary()
    {
        return new SalesPersonSalary();
    }
    @Bean(name="EmployeeDetails")
    public SalesPersonSalary getPersonDetails()
    {
        return new SalesPersonSalary("Awe","Some",1000);
    }

}
