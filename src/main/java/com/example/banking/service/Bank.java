package com.example.banking.service;

import com.example.banking.model.Company;
import org.springframework.stereotype.Service;

@Service
public class Bank implements BankInterface {
    @Override
    public Long openCommercialAccount(Company company, int pin, double depositAmount) {
        return -1L;
    }
}
