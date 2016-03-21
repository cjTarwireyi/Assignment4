package com.liskovs;

/**
 * Created by student on 3/21/16.
 */
public class Square extends Rectangle {

    public  Square(Double side)
    {
        super(side,side);
    }
public double calcArea()
{
    return super.calcArea();
}
}
