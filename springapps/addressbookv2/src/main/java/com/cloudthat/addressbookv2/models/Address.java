package com.cloudthat.addressbookv2.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable
public class Address {

    private Integer doorNumber;
    private String building;
    private String addressLine1;
    private String AddressLine2;

    private  String city;
    private  String state;
    private String zipcode;

}
