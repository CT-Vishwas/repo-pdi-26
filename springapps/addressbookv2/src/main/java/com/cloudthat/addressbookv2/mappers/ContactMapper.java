package com.cloudthat.addressbookv2.mappers;

import com.cloudthat.addressbookv2.dtos.ContactModel;
import com.cloudthat.addressbookv2.dtos.PhoneNumberModel;
import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.models.Gender;
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


    public ContactModel toContactModel(Contact contact){
        if(contact == null) return null;

        List<PhoneNumberModel> phoneNumberModels = contact.getPhoneNumbers().stream()
                .map(phoneNumber -> phoneNumberMapper.toPhoneNumberModel(phoneNumber))
                .toList();

        return new ContactModel(
                contact.getId(),
                contact.getContactName(),
                contact.getEmailId(),
                contact.getGender(),
                contact.getProfilePicture(),
                contact.getDob(),
//                contact.getAddress(),
                phoneNumberModels
//                contact.getTags()
        );
    }
}
