package com.ocp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/21/16.
 */
public class TstRecMethods {
    private Rectangle objRec;

    @Before
    public void setUp() throws Exception {
        ApplicationContext recContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objRec=(Rectangle)recContext.getBean("rectDetails");
    }

    @Test
    public void testLength() throws Exception {
        Assert.assertEquals(objRec.getLength(),4.0);

    }

    @Test
    public void testWidth() throws Exception {
        Assert.assertEquals(objRec.getWidth(),2.0);

    }
}
