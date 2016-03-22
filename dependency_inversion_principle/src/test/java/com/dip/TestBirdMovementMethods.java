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
   private BirdMovement objBirdMove;
  private   Ostrich objOstrich;
    @Before
    public void setUp() throws Exception {
        ApplicationContext birdContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objBirdMove= (BirdMovement)birdContext.getBean("BirdMovement");

    }

    @Before
    public void setUpOstrich() throws Exception {

ApplicationContext ostrichContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objOstrich=(Ostrich)ostrichContext.getBean("ostrich");
    }

    @Test
    public void testMove() throws Exception {
        Assert.assertNotSame(objBirdMove,objOstrich);
    }
}
