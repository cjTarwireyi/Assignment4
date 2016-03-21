package com.liskovs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rectangle objRect = new Square(4.0);
        Square objSquare= new Square(4.0);

        System.out.println( objRect.calcArea()+""+objSquare.calcArea());
    }
}
