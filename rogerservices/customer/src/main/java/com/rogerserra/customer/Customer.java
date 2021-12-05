package com.rogerserra.customer;

import lombok.Builder;
import lombok.Data;

@Data // is a shortcut for @getter @setter @ToString @EqualsAndHashCOde and @RequiredArgsConstructor
@Builder // lets us automatically produce the code required to have a class instantiated. Customer.builder().name("Torrente").adress.("Por alli")email("atleti")
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
