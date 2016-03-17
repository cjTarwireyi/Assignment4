package com.assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SalesPerson sp = new SalesPerson(1000,"aaaa","ssss",20,8);
        Casheer c= new Casheer("aaa","www",10,8);
       // demonstrating polyorpism in which one method is used to
        // calculate salary with commission and salary without commission
        System.out.println( "Hello World!" + sp.calcWages() );
        System.out.println( "Hello World!" + c.calcWages() );
    }
}
