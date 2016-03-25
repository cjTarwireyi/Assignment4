package com.assignment4;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/17/16.
 */

public class TestEmployeeMethods {
    private WagesCalculation wagesCalcInterface;
    private Employee emp;
    private SalesPerson salesPerson;
    @Before
    public void setUpEmployeeDetails() throws Exception {
        ApplicationContext detailsContext = new AnnotationConfigApplicationContext(AppConfig.class);
                emp=(Employee) detailsContext.getBean("EmployeeDetails");
    }

    @Before
    public void setUpemployyeeWages() throws Exception {
        ApplicationContext wagesContext = new AnnotationConfigApplicationContext(AppConfig.class);
        wagesCalcInterface=(WagesCalculation)wagesContext.getBean("employeeWages");
    }

    @Before
    public void setUpCommission() throws Exception {
        ApplicationContext commContext = new AnnotationConfigApplicationContext(AppConfig.class);
        salesPerson=(SalesPerson)commContext.getBean("commission");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalcWagesMethod() throws Exception {
        double wages=wagesCalcInterface.calcWages(10,8);
        Assert.assertEquals(wages,80.0);
    }

    @Test
    public void testGetName() throws Exception {
        String name = emp.getName();
        Assert.assertEquals(name,"Cornelious");
    }

    @Test
    public void testgetSurname() throws Exception {
        String surname=emp.getSurname();
        Assert.assertEquals(surname,"Tarwireyi");

    }

    @Test
    public void testcalcCommision() throws Exception {
        Double comm= salesPerson.commission();
        Assert.assertEquals(comm,100.0);
    }
}
