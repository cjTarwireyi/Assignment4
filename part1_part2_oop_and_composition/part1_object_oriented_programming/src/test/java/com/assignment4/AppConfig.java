package com.assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/17/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="employeeWages")
    public WagesCalculation getWages()
    {
        return new SalesPerson();


    }
    @Bean(name="EmployeeDetails")
    public Employee getDetails()
    {
        return new Employee("Cornelious","Tarwireyi");

    }
    @Bean (name="commission")
    public SalesPerson getCommision()
    {
        return new SalesPerson(1000.0,"Cornelious","Tarwireyi");
    }
}

