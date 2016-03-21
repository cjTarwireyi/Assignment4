package com.ocp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/21/16.
 */
public class TestTriangleMethods {
   private Triangle objTri;
    @Before
    public void setUp() throws Exception {
        ApplicationContext triContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objTri=(Triangle)triContext.getBean("triDetails");
    }

    @Test
    public void testBase() throws Exception {
        Assert.assertEquals(objTri.getBase(),2.0);

    }

    @Test
    public void testHeight() throws Exception {
        Assert.assertEquals(objTri.getHeight(),5.0);

    }
}
