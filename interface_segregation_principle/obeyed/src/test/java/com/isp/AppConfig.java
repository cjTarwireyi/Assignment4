package com.isp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/23/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="text")
    public TextInterface getText()
    {
        return new Text();
    }
    @Bean(name ="playmusic")
    public PlayMusicInterface getPlay()
    {
        return new PlayMusic();
    }
    @Bean (name ="Photos")
    public PhotoInterface getPhoto()
    {
        return new TakePhoto();
    }
    @Bean (name="call")
    public CallInterface getCall()
    {
        return new Call();
    }
}
