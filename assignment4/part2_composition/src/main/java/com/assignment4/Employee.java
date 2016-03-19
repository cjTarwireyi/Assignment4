package com.assignment4;

/**
 * Created by student on 3/17/16.
 */
public class Employee {

    SalesPersonSalary salesP;

    public Employee()
    {
        this.salesP=new SalesPersonSalary("Cornelious","Tarwireyi",1000.0);

    }

    public double getSalesPersonWages()
    {

        return salesP.calcWages(10,8);
    }
    public String getSalesPersonName()
    {
        return salesP.getName();

    }
    public String getSalesPersonSurnam()
    {
        return salesP.getSurname();
    }


}
