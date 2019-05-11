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
public abstract class Customer implements IAccount {
    private int accountNumber;
    private int pinNumber;
    private double availabelBalance;
    private double totalBalance;

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber
     */
    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int getPinNumber() {
        return pinNumber;
    }

    @Override
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getAvailabelBalance() {
        return availabelBalance;
    }

    public void setAvailabelBalance(double availabelBalance) {
        this.availabelBalance = availabelBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    
    public abstract void credit(double amount);
    public abstract void debit (double amount);
}
