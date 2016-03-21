package com.ocp;

/**
 * Created by student on 3/21/16.
 */
public class Triangle extends   AreaCalculation {
    private double base;
    private double height;
    public Triangle(double base, double height)
    {
        this.base=base;
        this.height=height;
    }
    @Override
    public  double  calcArea() {
        return base *height/2;
    }
}
