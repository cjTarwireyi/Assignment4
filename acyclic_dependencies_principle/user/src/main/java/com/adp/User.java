package com.adp;

/**
 * Created by student on 3/27/16.
 */
public class User {
    private String name;
    private String surname;
    private String password;
    private AuthenticationClass objAuth = new AuthenticationClass();

    public  User(String name,String surname,String password)
    {
        this.name=name;
        this.surname= surname;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }
    public String confirmationMsg()
    {
        return objAuth.authenticate();
    }
}
