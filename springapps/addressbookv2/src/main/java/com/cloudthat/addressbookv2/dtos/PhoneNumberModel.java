package com.cloudthat.addressbookv2.dtos;

import com.cloudthat.addressbookv2.models.PhoneType;

public record PhoneNumberModel(
        String countryCode,
        Integer number,
        PhoneType phoneType
) {
}
