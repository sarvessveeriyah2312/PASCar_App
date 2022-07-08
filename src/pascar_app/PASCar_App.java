
package pascar_app;
import java.util.Scanner;


public class PASCar_App {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        String name[] = {"John Wick ", "Maria Hantucova", "Jane Doe", "Emma William", "Michael Obama" };
        int customerID [] = {1,2,3,4,5};
        int rentedPeriod [] = {3,2,5,6,1};
        String vehicle[] = { "Car", "SUV","Car","Car","SUV", };
        String model [] ={"Persona","7 Seats","Kancil","Civic","5 Seats"};
        double rentalAmount [] ={250.00,250.00,240.00,410.00,90.00};
        double rebateAmount [] ={0.00,10.00,10.00,0.00,10.00};
        double penaltyAmount [] ={10.00,0.00,0.00,20.00,0.00};
        
         
        for(int i = 0; i < name.length; i++)
        {
        System.out.println("<<<< Customer " +customerID[i] +" >>>>" );
        System.out.println("Full Name: " +name[i]);
        System.out.print("Rented Vehicle: " +vehicle[i] +" ---> " +rentedPeriod[i] +" Day(s)");
        System.out.println("\nModel:" +model[i]);
        System.out.println("Late Penalty Fee: RM" +penaltyAmount[i]);  
        System.out.println("Rebat: RM" +rebateAmount[i]);
        System.out.println("Rent Amount: RM" +rentalAmount[i] );
        System.out.println("\n");
    }
    }
    
}
