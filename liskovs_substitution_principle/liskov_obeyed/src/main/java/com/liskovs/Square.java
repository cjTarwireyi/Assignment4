package com.liskovs;

/**
 * Created by student on 3/21/16.
 */
public class Square extends Shape{

    private double side;
    public Square(Double side)
    {
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calcArea() {
        return side*side;
    }
}
