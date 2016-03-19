package com.assignment4;

/**
 * Created by student on 3/19/16.
 */
public class Rectangle {
    AreaCalculation areaCalc;

    public Rectangle() {
        this.areaCalc = new AreaCalculation(10.0, 20.0);
    }

    public double getLength() {
        return areaCalc.getLength();
    }

    public double getWidth() {
        return areaCalc.getWidth();
    }

    public double getArea() {
        return areaCalc.calcArea();
    }
    public void DisplayArea()
    {
        areaCalc.printResults();
    }



}
