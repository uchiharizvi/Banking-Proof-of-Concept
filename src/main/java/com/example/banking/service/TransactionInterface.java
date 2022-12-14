package com.example.banking.service;

public interface TransactionInterface {
    double getBalance();
    void credit(double amount);
    boolean debit(double amount);
}
