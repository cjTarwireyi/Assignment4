package com.isp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/23/16.
 */
public class TestCallMethod {
    CallInterface objCall;
    @Before
    public void setUp() throws Exception {
        ApplicationContext callContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objCall=(Call)callContext.getBean("call");
    }

@Test
public void testCallMethod() throws Exception {
    Assert.assertEquals(objCall.call(),"calling");
}
}
