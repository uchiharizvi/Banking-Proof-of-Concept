package com.example.banking.service;

import com.example.banking.model.Company;

public interface BankInterface {
    Long openCommercialAccount(Company company, int pin, double depositAmount);
}
