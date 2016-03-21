package com.liskovs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Shape objSquare= new Square(4.0);
        Shape objRec = new Rectangle(5.0,6.0);
        System.out.println( objSquare.calcArea()+" "+objRec.calcArea() );
    }
}
