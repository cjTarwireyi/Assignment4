package com.assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     System.out.println("INHERITANCE, ENCAPSULATION & PLOLYMORHISM\n");
        SalesPerson sPerson = new SalesPerson((double) 1000,"Cornelious","Tarwireyi");
        Casheer casheer= new Casheer("Awe","Some");
       // demonstrating polyorpism in which one method is used to
        // calculate salary with commission and salary without commission
        System.out.println( "Sales Person\nName:\t"+sPerson.getName()+"\nLastName\t"+sPerson.getSurname()+"\nCommission\t"+
                sPerson.commission()+"\nWages:\t" + sPerson.calcWages(10,8) );
       System.out.println( "\n\nCasheer\n"+ "Name:\t" + casheer.getName()+"\nLastName:\t"+casheer.getSurname()+
               "\nWages:\t"+ casheer.calcWages(10,8) );
    }
}
