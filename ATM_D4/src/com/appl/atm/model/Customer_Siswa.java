/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author zefan
 */
public class Customer_Siswa extends Customer{

    public Customer_Siswa(int accountNumber, int pinNumber, double availableBalance, double totalBalance) {
        super(accountNumber, pinNumber, availableBalance, totalBalance);
    }

    @Override
    public void credit(double amount) {
        setAvailableBalance(getAvailableBalance() - amount);
        setTotalBalance(getTotalBalance() - amount);
    }

    @Override
    public void debit(double amount) {
        //setAvailableBalance(getAvailableBalance() + amount);
        setTotalBalance(getTotalBalance() + amount);
    }

    
}
