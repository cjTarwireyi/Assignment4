package com.assignment4;

/**
 * Created by student on 3/20/16.
 */
public class Triangle  extends Shape{
    private Double height;
    private Double base;

    public Triangle()
    {


    }
    public Triangle(double height,Double base)
    {
        super();
        this.height=height;
        this.base=base;

    }
    public double getHeight()
    {
        return height;
    }
    public double getBase()
    {
        return base;
    }

}
