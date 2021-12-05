package com.rogerserra.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email){

}
