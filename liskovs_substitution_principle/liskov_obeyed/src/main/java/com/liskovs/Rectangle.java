package com.liskovs;

/**
 * Created by student on 3/21/16.
 */
public class Rectangle extends Shape {
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getBreath() {
        return breath;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calcArea() {
        return length*breath;
    }
}
