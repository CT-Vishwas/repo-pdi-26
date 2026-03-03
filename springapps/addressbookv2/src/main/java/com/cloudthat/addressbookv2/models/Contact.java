package com.cloudthat.addressbookv2.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDate;

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

    @Column(length = 10)
    private Integer phoneNumber;

    @Convert(converter = GenderConverter.class)
    private Gender Gender;

    @Enumerated(EnumType.ORDINAL)
    private PhoneType phoneType;

    @Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
    private Boolean isActive = true;

    @Lob
    private byte[] profilePicture;

    private LocalDate dob;

    @CreationTimestamp
    private Instant createdAt;

    @Embedded
    private Address address;

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

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(Long id, String contactName, String emailId, Integer phoneNumber) {
        this.id = id;
        this.contactName = contactName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contactName='" + contactName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
