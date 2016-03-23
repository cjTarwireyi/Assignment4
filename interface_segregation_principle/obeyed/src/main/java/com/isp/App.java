package com.isp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CallInterface objCall = new Call();
        PhotoInterface objPhoto= new TakePhoto();
        System.out.println( objPhoto.takePhoto());
    }
}
