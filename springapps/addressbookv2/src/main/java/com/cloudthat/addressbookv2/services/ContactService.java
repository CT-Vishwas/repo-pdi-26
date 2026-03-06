package com.cloudthat.addressbookv2.services;

import com.cloudthat.addressbookv2.dtos.ContactModel;
import com.cloudthat.addressbookv2.mappers.ContactMapper;
import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.models.Tag;
import com.cloudthat.addressbookv2.repositories.ContactRepository;
import com.cloudthat.addressbookv2.repositories.TagRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactMapper contactMapper;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(ContactService.class);

    public Page<ContactModel> getAllContacts(Pageable pageable) {
        Page<Contact> contactPage = contactRepository.findAll(pageable);
        Page<ContactModel> modelPage = contactPage.map(contact -> contactMapper.toContactModel(contact));

        return modelPage;
    }



    public ContactModel createContact(ContactModel contactModel) {

        List<Tag> managedTags = new ArrayList<Tag>();
        if(contactModel.tags() != null){
            managedTags = contactModel.tags().stream()
                    .map(tag -> tagRepository.findByTagName(tag.tagName())
                            .orElseGet(()->tagRepository.save(new Tag(tag.tagName()))))
                    .toList();
        }

        Contact savingContact = contactMapper.toContact(contactModel);
        savingContact.setTags(managedTags);

        logger.info("Saving the contact with email: {}", savingContact.getEmailId());
        Contact newContact = contactRepository.save(savingContact);
        return contactMapper.toContactModel(newContact);
    }

    public Optional<Contact> getSingleContact(Long id) {
        return contactRepository.findById(id);
    }

    public Optional<Contact> getContactFromEmail(String email){
        return contactRepository.findByEmailId(email);
    }
}
