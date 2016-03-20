package com.assignment4;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/20/16.
 */
public class TestRectangle {
    Rectangle objRec;
    @Before
    public void setUpRec() throws Exception {
        ApplicationContext recCotxt = new AnnotationConfigApplicationContext(AppConfig.class);
        objRec=(Rectangle)recCotxt.getBean("rectDetails");

    }

    @Test
    public void testLength() throws Exception {
        Assert.assertEquals(objRec.getLength(),2.0);
    }

    @Test
    public void testWidth() throws Exception {
    Assert.assertEquals(objRec.getWidth(),3.0);
    }
}
