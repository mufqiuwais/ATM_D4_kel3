/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author Dewanto
 */
public class Admin implements IAccount {
    private int accountNumber;
    private int pinNumber;

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

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
    
    
}
