package com.example.banking.service;

import com.example.banking.model.Company;

public interface Bank {
    Long openCommercialAccount(Company company, int pin, double depositAmount);
}
