package com.assignment4;

/**
 * Created by student on 3/19/16.
 */
public class AreaCalculation {
    private Double length;
    private Double width;
    public AreaCalculation(Double l, Double w)
    {
        length=l;
        width=w;
    }
    public Double getLength()
    {
        return length;
    }
    public Double getWidth()
    {
        return width;
    }
    public Double calcArea()
    {
        return length*width;
    }
    public void printResults()
    {
        System.out.println("The area is: "+calcArea());
    }

}
