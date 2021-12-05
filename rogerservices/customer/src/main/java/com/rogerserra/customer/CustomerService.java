package com.rogerserra.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCostumer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email is valid
        // todo: check if email not taken
        // todo: store customer in db
    }
}
