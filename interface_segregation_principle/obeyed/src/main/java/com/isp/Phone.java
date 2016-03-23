package com.isp;

/**
 * Created by student on 3/23/16.
 */
public class Phone implements CallInterface,PhotoInterface,PlayMusicInterface,TextInterface{
    private CallInterface objCall;
    PhotoInterface objPhoto;
    PlayMusicInterface objPlay;
    TextInterface objText;
    public Phone(CallInterface objCall,PhotoInterface objPhoto,PlayMusicInterface objPlay,TextInterface objText)
    {
        this.objCall=objCall;
        this.objPhoto=objPhoto;
        this.objPlay=objPlay;
        this.objText=objText;
    }
    public String call() {
        return objCall.call();
    }

    public String takePhoto() {
        return objPhoto.takePhoto();
    }

    public String play() {
        return objPlay.play();
    }

    public String textMessage() {
        return objText.textMessage();
    }
}
