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
    public Employee(String fName,String lName,double hourlyRate,int hoursWorked)
    {
        name=fName;
        surname=lName;
        rate=hourlyRate;
        hours=hoursWorked;
    }

    public String toString() {
        return "Salary for :" + name + "   " + surname ;
    }


    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }
}
