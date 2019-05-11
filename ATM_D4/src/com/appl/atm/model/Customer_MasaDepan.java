/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author Naufal Rajabi
 */
public class Customer_MasaDepan extends Customer {

    public Customer_MasaDepan(int accountNumber, int pinNumber,
            double availableBalance, double totalBalance) {
        super(accountNumber, pinNumber, availableBalance, totalBalance);
    }

    @Override
    public void credit(double amount) {
        try{
            setAvailableBalance(getTotalBalance() - amount);
            setTotalBalance(getTotalBalance() - amount);
        } catch (Exception e){
            
        }
    }

    @Override
    public void debit(double amount) {
        
        setTotalBalance(getTotalBalance() + amount);
    }
    
    
}
