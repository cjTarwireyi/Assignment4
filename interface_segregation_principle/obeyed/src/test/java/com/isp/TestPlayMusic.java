package com.isp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/23/16.
 */
public class TestPlayMusic {
    PlayMusicInterface objPlay;

    @Before
    public void setUp() throws Exception {
        ApplicationContext playContext = new AnnotationConfigApplicationContext(AppConfig.class);
        objPlay=(PlayMusic)playContext.getBean("playmusic");
    }
    @Test
    public void testPlayMusicMethod() throws Exception {
        Assert.assertEquals(objPlay.play(),"playing");
    }
    }
