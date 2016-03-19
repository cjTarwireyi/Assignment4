package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
public class Employee {

    //demonstrates encaptulation
    private String name;
    private String surname;
    private double rate;
    private int hours;
    public Employee()
    {

    }
    public Employee(String fName,String lName) {
        name = fName;
        surname = lName;
    }

    public String toString() {
        return "Salary for :" + name + "   " + surname ;
    }

    public String getName(){return name;}
    public String getSurname(){return surname;}

}
