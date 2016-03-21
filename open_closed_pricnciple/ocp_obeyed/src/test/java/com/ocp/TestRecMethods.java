package com.ocp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/21/16.
 */
public class TestRecMethods {
   private AreaCalculation objAreaCalc;
    @Before
    public void setUp() throws Exception {
        ApplicationContext rectContect = new AnnotationConfigApplicationContext(AppConfig.class);
        objAreaCalc=(Rectangle)rectContect.getBean("rectatangleArea");
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(objAreaCalc.calcArea(),50.0);
    }
}
