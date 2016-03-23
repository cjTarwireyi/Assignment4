package com.isp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/23/16.
 */
public class TestTextMethods {
    TextInterface objText;
    @Before
    public void setUp() throws Exception {
        ApplicationContext textContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objText=(Text)textContext.getBean("text");
    }
    @Test
    public void testTextMethod() throws Exception {
        Assert.assertEquals(objText.textMessage(),"texting...");
    }
}
