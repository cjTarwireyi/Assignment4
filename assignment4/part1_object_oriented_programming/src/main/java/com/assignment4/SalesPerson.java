package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
//extent demonstrate inheritents
public class SalesPerson extends Employee implements WagesCalculation{


    private double totalSales;
    public SalesPerson(){}

    public SalesPerson(double sales,String fName,String lName,double hourlyRate,int hoursWorked)
    {
        super( fName,lName,hourlyRate, hoursWorked);
        totalSales=sales;
    }
    public double commission()
    {

        return totalSales*0.1;
    }

    public double calcWages() {
        return commission()+super.getRate()*super.getHours();
    }

}
