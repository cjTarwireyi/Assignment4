package com.assignment4;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/20/16.
 */
public class TesTriangle {
        Triangle objTri;
    @Before
    public void setUpTriangle() throws Exception {
        ApplicationContext triContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objTri=(Triangle)triContext.getBean("triAgleDetails");

    }

    @Test
    public void testBase() throws Exception {
        Assert.assertEquals(objTri.getBase(),5.0);

    }

    @Test
    public void testHeight() throws Exception {
    Assert.assertEquals(objTri.getHeight(),10.0);
    }
}
