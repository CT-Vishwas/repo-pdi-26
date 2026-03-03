package com.cloudthat.addressbookv2.services;

import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return  contactRepository.findAll();
    }

    public Contact createContact(Contact contact) {
        if(contact.getPhoneNumbers() != null){
            contact.getPhoneNumbers().forEach(
                    phone -> phone.setContact(contact)
            );
        }
        return contactRepository.save(contact);
    }
}
