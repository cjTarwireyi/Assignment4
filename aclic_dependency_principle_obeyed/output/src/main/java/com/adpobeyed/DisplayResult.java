package com.adpobeyed;

/**
 * Created by student on 3/27/16.
 */
public class DisplayResult {
private  AuthenticationClass objAuth;
    public DisplayResult()
    {


    }

    public void confirmationMsg()
    {
        System.out.println(objAuth.authenticate());
    }
}
