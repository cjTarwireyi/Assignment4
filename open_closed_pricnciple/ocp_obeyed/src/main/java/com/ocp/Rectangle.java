package com.ocp;

/**
 * Created by student on 3/21/16.
 */
public class Rectangle extends AreaCalculation {
    private double length;
    private double width;
    public  Rectangle   (double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    @Override
    public double calcArea() {
        return length*width;
    }
}
