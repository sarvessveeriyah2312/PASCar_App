/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascar_app;


public class Car extends Vehicle {
    private String model;

    //Constructor

    public Car(String model, String firstname, String lastName, int rentalReriod, boolean earlyDropOff, int lateDropOff, Customer cust) {
        super(firstname, lastName, rentalReriod, earlyDropOff, lateDropOff, cust);
        this.model = model;
    }
   
   

    
    public void carPriceRate(double CarPriceRate){
        
    }
    public void totalRentalAmount(double totalRentalAmount){
        
    }
    
}
