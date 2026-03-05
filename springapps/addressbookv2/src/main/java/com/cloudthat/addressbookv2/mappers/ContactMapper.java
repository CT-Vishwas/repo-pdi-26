package com.cloudthat.addressbookv2.mappers;

import com.cloudthat.addressbookv2.dtos.ContactModel;
import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.models.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactMapper {

    @Autowired
    private PhoneNumberMapper phoneNumberMapper;

    public Contact toContact(ContactModel contactModel){
        if (contactModel == null) return null;
        Contact newContact = new Contact();
        newContact.setId(contactModel.id());
        newContact.setContactName(contactModel.contactName());
        newContact.setEmailId(contactModel.emailId());
        newContact.setGender(contactModel.gender());
        newContact.setDob(contactModel.dob());
        newContact.setProfilePicture(contactModel.profilePicture());

        List<PhoneNumber> phoneNumbers = contactModel.phoneNumbers().stream()
                .map(p->phoneNumberMapper.toPhoneNumber(p))
                .toList();

        newContact.setPhoneNumbers(phoneNumbers);
        return newContact;
    }
}
