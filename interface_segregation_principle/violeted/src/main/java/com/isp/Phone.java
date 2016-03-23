package com.isp;

/**
 * Created by student on 3/23/16.
 */
public class Phone implements  PhoneServices {
    public String call() {
        return "calling";
    }

    public String text() {
        return "texting";
    }

    public String playMusic() {
        return "playing";
    }

    public String takePhoto() {
        return "taking photo";
    }
}
