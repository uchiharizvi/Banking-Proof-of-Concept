package com.example.banking.service;

public class Transaction implements TransactionInterface {
    private Long accountNumber;
    private Bank bank;

    public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
        this.accountNumber = accountNumber;
        this.bank = bank;
    }

    @Override
    public double getBalance() {
        return -1;
    }

    @Override
    public void credit(double amount) {
        // complete the function
    }

    @Override
    public boolean debit(double amount) {
        // complete the function
        return true;
    }
}
