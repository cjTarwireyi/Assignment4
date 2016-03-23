package com.isp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/23/16.
 */
public class TestPhoneMethods {
    PhoneServices objPhoneService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext phoneContext = new AnnotationConfigApplicationContext(AppConfig.class);

        objPhoneService=(Phone)phoneContext.getBean("Phone");
    }

    @Test
    public void testCallMethod() throws Exception {
        Assert.assertEquals(objPhoneService.call(),"calling");
    }

    @Test
    public void testTextMethod() throws Exception {
        Assert.assertEquals(objPhoneService.text(),"texting");
    }

    @Test
    public void testTakePhotoMethod() throws Exception {
        Assert.assertEquals(objPhoneService.takePhoto(),"taking photo");
    }

    @Test
    public void testPlayMusicMethod() throws Exception {
        Assert.assertEquals(objPhoneService.playMusic(),"playing");
    }
}
