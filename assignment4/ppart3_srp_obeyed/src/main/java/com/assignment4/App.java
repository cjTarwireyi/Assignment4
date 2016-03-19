package com.assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Rectangle rect = new Rectangle();
        PrintResult printR=new PrintResult();

        printR.displayArea(rect.getArea());

    }
}
