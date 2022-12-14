package com.example.banking.model;

public class CommercialAccountRequest {
    private Company company;
    private int pin;
    private double amount;

    public CommercialAccountRequest(Company company, int pin, double amount) {
        this.company = company;
        this.pin = pin;
        this.amount = amount;
    }

    public Company getCompany() {
        return company;
    }

    public int getPin() {
        return pin;
    }

    public double getAmount() {
        return amount;
    }
}
