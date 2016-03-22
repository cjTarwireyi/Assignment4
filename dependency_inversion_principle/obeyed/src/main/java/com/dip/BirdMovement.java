package com.dip;

/**
 * Created by student on 3/22/16.
 */
public class BirdMovement {
   private MovementService objMovement;
    public BirdMovement(MovementService objMovement)
    {
        this.objMovement=objMovement;
    }
    public void getMovement()
    {
       System.out.println( objMovement.move());
    }
}
