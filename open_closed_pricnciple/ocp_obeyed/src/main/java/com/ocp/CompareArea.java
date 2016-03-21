package com.ocp;

/**
 * Created by student on 3/21/16.
 */
public class CompareArea {
    public void printLarger(double area1,double area2)
    {
        double maxmum=Math.max(area1,area2);
        if (area2>area1) {
            System.out.println("Rectangle is larger");
        }
        else if (area1>area2)
        {
            System.out.println("Triangle is larger");
        }
        else
        {
            System.out.println("they are equal");
        }
    }
}
