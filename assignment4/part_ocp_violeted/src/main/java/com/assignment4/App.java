package com.assignment4;

import sun.security.provider.SHA;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

        Triangle objTriangle = new Triangle(10.0,100.0);
        Rectangle objRect = new Rectangle(5.0,4.0);
        AreaCalculation objAreaCalc = new AreaCalculation(objTriangle,objRect);

        System.out.println(objAreaCalc.calcArea());
    }
}
