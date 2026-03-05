package com.cloudthat.addressbookv2.mappers;

import com.cloudthat.addressbookv2.dtos.PhoneNumberModel;
import com.cloudthat.addressbookv2.models.PhoneNumber;
import org.springframework.stereotype.Component;

@Component
public class PhoneNumberMapper {

    public PhoneNumber toPhoneNumber(PhoneNumberModel phoneNumberModel){
        if(phoneNumberModel == null) return null;
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber(phoneNumberModel.number());
        phoneNumber.setCountryCode(phoneNumberModel.countryCode());
        phoneNumber.setPhoneType(phoneNumberModel.phoneType());

        return phoneNumber;
    }

    public PhoneNumberModel toPhoneNumberModel(PhoneNumber phoneNumber){
        if(phoneNumber == null) return null;

        return new PhoneNumberModel(
                phoneNumber.getCountryCode(),
                phoneNumber.getNumber(),
                phoneNumber.getPhoneType()
        );
    }
}
