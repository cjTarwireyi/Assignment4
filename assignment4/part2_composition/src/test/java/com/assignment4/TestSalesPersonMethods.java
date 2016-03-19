package com.assignment4;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/19/16.
 */

public class TestSalesPersonMethods {
   private WagesCalculation wagesCalculationInterface;
    private SalesPersonSalary salesPerson;
    @Before
    public void setUp() throws Exception {
        ApplicationContext wagesContext = new AnnotationConfigApplicationContext(AppConfig.class);
        wagesCalculationInterface=(WagesCalculation)wagesContext.getBean("monthlyWages");
    }

    @Before
    public void setUpEmployeeDetails() throws Exception {
        ApplicationContext detailsContext = new AnnotationConfigApplicationContext(AppConfig.class);
        salesPerson=(SalesPersonSalary) detailsContext.getBean("EmployeeDetails");
    }
    @Test
    public void testCalcWages() throws Exception {
        Double wages=wagesCalculationInterface.calcWages(10,8);
        Assert.assertEquals(wages,80.0);
    }

    @Test
    public void testGetName() throws Exception {
        String name=salesPerson.getName();
        Assert.assertEquals(name,"Awe");

    }

    @Test
    public void testGetSurname() throws Exception {
        String surname=salesPerson.getSurname();
        Assert.assertEquals(surname,"Some");

    }
}
