package com.assignment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/20/16.
 */
public class TestAreaCalculation {
    private AreaCalculation objAreaCalc;
    @Before
    public void setUp() throws Exception {
        ApplicationContext calcContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objAreaCalc=(AreaCalculation)calcContext.getBean("areaCalc");

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals(objAreaCalc.calcArea(),objAreaCalc.calcArea());

    }
}
