package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
//extent demonstrate inheritents
public class SalesPerson extends Employee implements WagesCalculation{


    private double totalSales;
    public SalesPerson(){}

    public SalesPerson(Double sales,String fName,String lName)
    {
        super( fName,lName);
        totalSales=sales;
    }
    public double commission()
    {

        return totalSales*0.1;
    }

    public double calcWages(double rate,int hrs) {

        return commission()+rate*hrs;
    }

}
