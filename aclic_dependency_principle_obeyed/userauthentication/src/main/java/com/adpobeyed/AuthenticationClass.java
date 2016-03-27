package com.adpobeyed;

/**
 * Created by student on 3/27/16.
 */
public class AuthenticationClass {
        private User objUser;
    public AuthenticationClass(){

    }
    public String authenticate()
    {
        if (objUser.getName()=="Cornelious"&& objUser.getPassword()=="12345")

      return "Successfull log in";
        else
            return "failed log in";
    }
}
