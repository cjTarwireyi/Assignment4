package com.isp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/23/16.
 */
public class TestPhotoMethods {
    PhotoInterface objPhoto;
    @Before
    public void setUp() throws Exception {
        ApplicationContext photoContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objPhoto=(TakePhoto)photoContext.getBean("Photos");
    }
    @Test
    public void testTakePhotoMethod() throws Exception {
        Assert.assertEquals(objPhoto.takePhoto(),"taking photo");
    }
}
