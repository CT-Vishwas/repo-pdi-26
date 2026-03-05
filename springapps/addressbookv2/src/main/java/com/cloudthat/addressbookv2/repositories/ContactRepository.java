package com.cloudthat.addressbookv2.repositories;

import com.cloudthat.addressbookv2.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    public Optional<Contact> findByEmailId(String emailId);
}
