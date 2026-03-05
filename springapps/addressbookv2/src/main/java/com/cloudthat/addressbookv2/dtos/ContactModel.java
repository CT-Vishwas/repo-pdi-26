package com.cloudthat.addressbookv2.dtos;

import com.cloudthat.addressbookv2.models.Address;
import com.cloudthat.addressbookv2.models.Gender;

import java.time.LocalDate;
import java.util.List;

public record ContactModel(
        Long id,
        String contactName,
        String emailId,
        Gender gender,
        byte[] profilePicture,
        LocalDate dob,
        AddressModel address,
        List<PhoneNumberModel> phoneNumbers,
        List<String> tagNames
) {
}
