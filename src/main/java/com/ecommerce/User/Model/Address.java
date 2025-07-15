package com.ecommerce.User.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "address_id")
    private Long id;

    @NotBlank
    @Size(min=5, message= "Street name must be atleast 5 characters")
    private String street;

    @NotBlank
    @Size(min=5, message= "City name must be atleast 5 characters")
    private String city;

    @NotBlank
    @Size(min=2, message= "State Name name must be atleast 2 characters")
    private String state;

    @NotBlank
    @Size(min=2, message= "Country Name name must be atleast 2 characters")
    private String country;

    @NotBlank
    @Size(min=6, message= "Zipcode Name name must be atleast 6 characters")
    private String zipcode;

    public Address(String street, String city, String state, String country, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
}