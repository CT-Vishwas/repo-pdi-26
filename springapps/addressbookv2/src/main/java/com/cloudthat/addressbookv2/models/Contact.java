package com.cloudthat.addressbookv2.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Contact")
@Table(name = "AddressBook")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactId")
    private Long id;

    @Column(name="contactName", length = 50)
    private String contactName;
    private String emailId;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    @Convert(converter = GenderConverter.class)
    private Gender gender;

    @Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
    private Boolean isActive = true;

    @Lob
    private byte[] profilePicture;

    private LocalDate dob;

    @CreationTimestamp
    private Instant createdAt;

    @Embedded
    private Address address;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Tag> tags = new ArrayList<Tag>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Contact() {
    }

    public void addPhoneNumber(PhoneNumber phoneNumber){
        phoneNumbers.add(phoneNumber);
        phoneNumber.setContact(this);
    }
}
