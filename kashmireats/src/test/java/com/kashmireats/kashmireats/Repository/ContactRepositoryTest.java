package com.kashmireats.kashmireats.Repository;

import com.kashmireats.kashmireats.Models.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ContactRepositoryTest {
    @Autowired
    private  ContactRepository contactRepository;
    @Test
    void getAllContactsByUsername() {
        Contact contact = new Contact( 5,  "username",  "mobile",  "phone");
        contactRepository.save(contact);
        assertThat(contactRepository.getAllContactsByUsername("username")).isEqualTo(contact);

    }
}