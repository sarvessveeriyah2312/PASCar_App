/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascar_app;


public class SUV extends Vehicle{
    private int numOfSeat;

    public SUV(int numOfSeat, String firstname, String lastName, int rentalReriod, boolean earlyDropOff, int lateDropOff, Customer cust) {
        super(firstname, lastName, rentalReriod, earlyDropOff, lateDropOff, cust);
        this.numOfSeat = numOfSeat;
    }

   

    public void suvPriceRate(double suvPriceRate){
        
    }
    public void totalRentalAmount(double totalRentalAmount){
        
    }
    
}
