package com.example.banking.model;

public class Company {
    private String companyName;

    public Company(String companyName, int taxId) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
