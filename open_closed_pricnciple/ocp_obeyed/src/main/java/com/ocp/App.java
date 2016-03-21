package com.ocp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Triangle objTriangle = new Triangle(0.0,0.0);
        Rectangle objRect = new Rectangle(0.0,0.0);
        CompareArea objCompare = new CompareArea();
        objCompare.printLarger(objTriangle.calcArea(),objRect.calcArea());

    }
}
