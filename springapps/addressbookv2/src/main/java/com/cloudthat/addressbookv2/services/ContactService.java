package com.cloudthat.addressbookv2.services;

import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.models.Tag;
import com.cloudthat.addressbookv2.repositories.ContactRepository;
import com.cloudthat.addressbookv2.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private TagRepository tagRepository;

    public Page<Contact> getAllContacts(Pageable pageable) {

        return  contactRepository.findAll(pageable);
    }

    public Contact createContact(Contact contact) {
        System.out.println(contact);
        if(contact.getPhoneNumbers() != null){
            contact.getPhoneNumbers().forEach(
                    phone -> phone.setContact(contact)
            );
        }

        if(contact.getTags() != null){
            List<Tag> managedTags = contact.getTags().stream()
                    .map(tag -> tagRepository.findByTagName(tag.getTagName())
                            .orElseGet(()->tagRepository.save(tag)))
                    .collect(Collectors.toList());

            contact.setTags(managedTags);
        }
        return contactRepository.save(contact);
    }

    public Optional<Contact> getSingleContact(Long id) {
        return contactRepository.findById(id);
    }

    public Optional<Contact> getContactFromEmail(String email){
        return contactRepository.findByEmailId(email);
    }
}
