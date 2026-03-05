package com.cloudthat.addressbookv2.controllers;

import com.cloudthat.addressbookv2.config.AppConfig;
import com.cloudthat.addressbookv2.dtos.ContactModel;
import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

//    @Value("${app.support-email}")
//    private String helpEmail;

    private final AppConfig appConfig;

    public ContactController(AppConfig appConfig){
        this.appConfig = appConfig;
    }

    @GetMapping
    public Page<Contact> getAll(Pageable pageable){

        return contactService.getAllContacts(pageable);
    }

    @GetMapping("/{id}")
    public Optional<Contact> getContact(@PathVariable Long id){
        return  contactService.getSingleContact(id);
    }

    @GetMapping("/search")
    public Optional<Contact> search(
            @RequestParam String email
    ){
        return contactService.getContactFromEmail(email);
    }
//    @PostMapping
//    public Contact create(@RequestBody Contact contact){
//        return contactService.createContact(contact);
//    }

    @PostMapping
    public ContactModel create(@RequestBody ContactModel contactModel){
        return contactService.createContact(contactModel);
    }

    @GetMapping("/help")
    public String help(){
        return "You can get help using mailto:"+appConfig.getSupportEmail();
    }
}
