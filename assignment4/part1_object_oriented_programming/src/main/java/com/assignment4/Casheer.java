package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
//extend demonstrate inheritance
public class Casheer extends Employee implements  WagesCalculation{
    public Casheer(String fName,String lName)
    {
      super( fName,lName);
    }


    public double calcWages(double rate,int hrs) {
        return rate*hrs;
    }
}
