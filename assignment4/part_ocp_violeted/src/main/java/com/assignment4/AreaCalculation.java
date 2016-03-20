package com.assignment4;

/**
 * Created by student on 3/19/16.
 */
public class AreaCalculation {
    private Shape objShape  ;
    private Triangle objTriangle  ;
    private Rectangle objRect;

    private double triArea;
    private double recArea;

public AreaCalculation(){}
    public AreaCalculation(Triangle objTri,Rectangle objRect)
    {
       objTriangle=objTri;
        this.objRect=objRect;
        objShape=objTri;
    }

    public Double calcArea()
    {
         if (objTriangle.equals(objShape))

           triArea=objTriangle.getBase() * objTriangle.getHeight()/ 2;

            recArea =  (objRect.getLength() * objRect.getWidth());


             if (triArea>recArea) {
                 System.out.println("Triangle is bigger");
                 return triArea;
             }
            else
             {
                 System.out.println("Rectangle is bigger");
                 return recArea;
             }
    }


}
