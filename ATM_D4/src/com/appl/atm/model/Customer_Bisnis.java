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
public class Customer_Bisnis extends Customer{

    public Customer_Bisnis(int accountNumber, int pinNumber,
            double availableBalance, double totalBalance) {
        super(accountNumber, pinNumber, availableBalance, totalBalance);
    }
    
    @Override
    public void credit(double amount) {
        setAvailableBalance(getAvailableBalance() - amount);
        setTotalBalance(getTotalBalance() - amount);
    }

    @Override
    public void debit(double amount) {
        setAvailableBalance(getAvailableBalance() + amount);
        setTotalBalance(getTotalBalance() + amount);
    }
    
}
