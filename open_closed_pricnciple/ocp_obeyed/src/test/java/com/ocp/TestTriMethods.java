package com.ocp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/21/16.
 */
public class TestTriMethods {
    private AreaCalculation objAreaCal;
    @Before
    public void setUp() throws Exception {
        ApplicationContext triContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objAreaCal= (Triangle)triContext.getBean("triAngleArea");
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(objAreaCal.calcArea(),7.5);
    }
}
