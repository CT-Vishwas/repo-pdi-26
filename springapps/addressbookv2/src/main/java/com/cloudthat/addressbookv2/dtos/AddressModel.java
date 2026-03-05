package com.cloudthat.addressbookv2.dtos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

public record AddressModel(
   Integer doorNumber,
   String building,
   String addressLine1,
   String AddressLine2,
   String city,
   String state,
   String zipcode
) {
}
