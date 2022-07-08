/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascar_app;

public class  Vehicle {
    public int rentalPeriod;
    public boolean earlyDropOff;
    public int lateDropOff;
    public Customer cust;

    //Constructor
    public Vehicle(String firstname, String lastName,int rentalReriod, boolean earlyDropOff, int lateDropOff, Customer cust) {
        this.rentalPeriod = rentalPeriod;
        this.earlyDropOff = earlyDropOff;
        this.lateDropOff = lateDropOff;
        this.cust = new Customer(firstname,lastName);
    }
    
    public void totalRentalAmount(double totalRentalAmount){
        //totalRentalAmount= rentalPeriod + cashRebate(totalRentalAmount) + lateReturningFee(totalRentalAmount);
        return;
    }
    
    public void lateReturningFee(double lateRetruningFee){
    }
    
    public void cashRebate(double cashRebate){
        
    }
    public void getCustomerName(String getCustomerName){
     
 }    
    
    
}
