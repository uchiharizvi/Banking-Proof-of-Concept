package com.example.banking.service;

import com.example.banking.model.Company;
import com.example.banking.model.Person;

import java.util.List;

public class CommercialAccount {
    private List<Person> authorizedUsers;

    public CommercialAccount(Company company, Long accountNUmber, double deposit) {
        // complete the function
    }
    protected void addAuthorizedUser(Person person){
        // complete the function
    }
    public boolean isAuthorizedUser(Person person){
        // complete the function
        return true;
    }
}
