package com.dip;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ostrich objOstrich = new Ostrich();
        Dove objDove = new Dove();
        BirdMovement objMovement = new BirdMovement(objOstrich);
        BirdMovement objMovement2 = new BirdMovement(objDove);
        objMovement.getMovement();
        objMovement2.getMovement();

    }
}
