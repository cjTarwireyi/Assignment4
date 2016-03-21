package com.liskovs;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/21/16.
 */
public class TestRectMethods {
    private Rectangle objRect;

    @Before
    public void setUp() throws Exception {
        ApplicationContext rectContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objRect=(Rectangle)rectContext.getBean("rectDetails");


    }

    @Test
    public void testLength() throws Exception {
        Assert.assertEquals(objRect.getLength(),5.0);
    }

    @Test
    public void testWidth() throws Exception {
        Assert.assertEquals(objRect.getBreath(),6.0);

    }

    @Test
    public void testCalcArea() throws Exception {
        Assert.assertEquals(objRect.calcArea(),30.0);

    }
}
