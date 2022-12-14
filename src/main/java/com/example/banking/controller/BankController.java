package com.example.banking.controller;

import com.example.banking.model.CommercialAccountRequest;
import com.example.banking.service.BankInterface;
import com.example.banking.service.IBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/bank")
@RestController
public class BankController {
    @Autowired
    private BankInterface bank;
    @PostMapping("/account/commercial")
    public Long openCommercialAccount(@RequestBody CommercialAccountRequest commercialAccountRequest){
        return bank.openCommercialAccount(commercialAccountRequest.getCompany(),
                commercialAccountRequest.getPin(),commercialAccountRequest.getAmount());
    }
}
