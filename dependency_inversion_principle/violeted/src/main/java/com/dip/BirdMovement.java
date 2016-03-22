package com.dip;

/**
 * Created by student on 3/22/16.
 */
public class BirdMovement {
   private Ostrich objOstrich;
    public BirdMovement()
    {
        objOstrich=new Ostrich();
    }
    public void move()
    {
        System.out.println(objOstrich.run());
    }
}
