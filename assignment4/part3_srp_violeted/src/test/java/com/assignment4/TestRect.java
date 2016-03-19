package com.assignment4;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/19/16.
 */
public class TestRect {
    private AreaCalculation recDetail;

    @Before
    public void setUp() throws Exception {
        ApplicationContext violetContext= new AnnotationConfigApplicationContext(AppConfig.class);
        recDetail= (AreaCalculation) violetContext.getBean("rectDetails");
    }

    @Test
    public void testLength() throws Exception {
        Double length=recDetail.getLength();
        Assert.assertEquals(length,10.0);
      }
    @Test
    public void testWidth() throws Exception {
        Double with=recDetail.getWidth();
        Assert.assertEquals(with,5.0);
    }

    @Test
    public void testCalcArea() throws Exception {
        Double area=recDetail.calcArea();
        Assert.assertEquals(area,50.0);
    }


}
