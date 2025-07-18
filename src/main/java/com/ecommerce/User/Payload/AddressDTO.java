package com.ecommerce.User.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private String street;
    private String city;
    private String buildingName;
    private String state;
    private String country;
    private String zipcode;

}