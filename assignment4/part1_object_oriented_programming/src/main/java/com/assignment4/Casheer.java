package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
//extend demonstrate inheritance
public class Casheer extends Employee implements  WagesCalculation{
    public Casheer(String fName,String lName,double hourlyRate,int hoursWorked)
    {
      super( fName,lName,hourlyRate, hoursWorked);
    }


    public double calcWages() {
        return super.getHours()*super.getRate();
    }
}
