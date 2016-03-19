package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
//extent demonstrate inheritents
public class SalesPersonSalary implements WagesCalculation  {

    private String name;
    private String surname;
    private double totalSales;
    public SalesPersonSalary(){}
    public SalesPersonSalary(String name,String surname, double s)
    {
        this.name=name;
        this.surname=surname;
        totalSales=s;
    }
    public String getName()
    {
        return name;

    }
    public String getSurname()
    {
        return surname;
    }

    public double commission()
    {

        return totalSales* 0.1;
    }
    public double calcWages(double rate,int hrs) {

        return commission()+rate*hrs;
    }


}
