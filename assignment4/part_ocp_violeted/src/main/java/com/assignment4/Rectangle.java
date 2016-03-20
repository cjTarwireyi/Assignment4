package com.assignment4;

/**
 * Created by student on 3/19/16.
 */
public class Rectangle extends  Shape{

    private double width;
    private double length;
    public Rectangle(){}

    public Rectangle(double length,double width) {
        this.width=width;
        this.length=length;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }





}
