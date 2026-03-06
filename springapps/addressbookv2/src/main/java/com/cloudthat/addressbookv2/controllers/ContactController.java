package com.cloudthat.addressbookv2.controllers;

import com.cloudthat.addressbookv2.config.AppConfig;
import com.cloudthat.addressbookv2.dtos.ApiResponse;
import com.cloudthat.addressbookv2.dtos.ContactModel;
import com.cloudthat.addressbookv2.models.Contact;
import com.cloudthat.addressbookv2.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    private final AppConfig appConfig;

    public ContactController(AppConfig appConfig){
        this.appConfig = appConfig;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Page<ContactModel>>> getAll(Pageable pageable){
        Page<ContactModel> page = contactService.getAllContacts(pageable);

        if(page == null){
            return ResponseEntity.status(404).body(new ApiResponse<>(false,"No Contacts found", null,0L));
        }

        return ResponseEntity.status(200).body(new ApiResponse<>(true,"Contacts fetched successfully",page,0L));
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

    @PostMapping
    public ResponseEntity<ApiResponse<ContactModel>> create(@RequestBody ContactModel contactModel){
        ContactModel savedContactModel = contactService.createContact(contactModel);
        if(savedContactModel == null){
            return ResponseEntity.status(400).body(new ApiResponse<>(false, "Cannot Create Contact",null,0L));
        }

        return ResponseEntity.status(201).body(new ApiResponse<>(true,"Contact Created Successfully",savedContactModel,0L));
    }

    @GetMapping("/help")
    public String help(){
        return "You can get help using mailto:"+appConfig.getSupportEmail();
    }
}
