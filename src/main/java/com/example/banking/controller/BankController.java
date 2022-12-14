package com.example.banking.controller;

import com.example.banking.service.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/bank")
@RestController
public class BankController {
    @Autowired
    private Bank bank;
    @PostMapping("/account/commercial")
    public String openCommercialAccount(){
        return bank.openCommercialAccount();
    }
}
