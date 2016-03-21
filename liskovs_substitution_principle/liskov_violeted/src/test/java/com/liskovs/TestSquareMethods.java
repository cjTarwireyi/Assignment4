package com.liskovs;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/21/16.
 */
public class TestSquareMethods {
    private Square objSquare;
    @Before
    public void setUp() throws Exception {
        ApplicationContext squareContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objSquare=(Square)squareContext.getBean("squareDetails");

    }

    @Test
    public void testCalcArea() throws Exception {
        Assert.assertEquals(objSquare.calcArea(),16.0);
    }
}
