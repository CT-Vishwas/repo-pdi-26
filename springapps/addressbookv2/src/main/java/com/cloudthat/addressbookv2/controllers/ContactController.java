package com.cloudthat.addressbookv2.controllers;

import com.cloudthat.addressbookv2.config.AppConfig;
import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Contact> getAll(){
        return contactService.getAllContacts();
    }

    @PostMapping
    public Contact create(@RequestBody Contact contact){
        return contactService.createContact(contact);
    }

    @GetMapping("/help")
    public String help(){
        return "You can get help using mailto:"+appConfig.getSupportEmail();
    }
}
