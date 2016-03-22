package com.dip;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/22/16.
 */
public class TestBirdMovementMethods {
   private Dove objDove;
  private   Ostrich objOstrich;
    @Before
    public void setUp() throws Exception {
        ApplicationContext doveContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objDove= (Dove) doveContext.getBean("Dove");

    }

    @Before
    public void setUpOstrich() throws Exception {

ApplicationContext ostrichContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objOstrich=(Ostrich)ostrichContext.getBean("ostrich");
    }

    @Test
    public void testDoveMove() throws Exception {
        Assert.assertEquals(objDove.move(),"i am a dove i fly");
    }

    @Test
    public void testOstrichMove() throws Exception {
        Assert.assertEquals(objOstrich.move(),"i am an ostrich i Run");

    }
}
