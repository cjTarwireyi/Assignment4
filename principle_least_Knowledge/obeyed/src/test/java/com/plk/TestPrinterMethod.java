package com.plk;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/25/16.
 */
public class TestPrinterMethod {
    Printer objPrinter ;

    @Before
    public void setUp() throws Exception {
        ApplicationContext printerContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objPrinter=(Printer)printerContext.getBean("Laptop");
        }

    @Test
    public void testPrint() throws Exception {
        Assert.assertEquals( objPrinter.print(),"document printed");
    }
}
