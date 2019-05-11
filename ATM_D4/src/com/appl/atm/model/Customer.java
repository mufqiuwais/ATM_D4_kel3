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
    private double availableBalance;
    private double totalBalance;

    public Customer(int accountNumber, int pinNumber,
            double availableBalance, double totalBalance) {
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
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
