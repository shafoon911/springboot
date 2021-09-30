package com.kashmireats.kashmireats.Services;

import com.kashmireats.kashmireats.Models.Contact;
import com.kashmireats.kashmireats.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImplementation implements ContactService {
    @Autowired
    ContactRepository contactRepository;


    @Override
    public List<Contact> getAllContacts(String username) {
        return contactRepository.getAllContactsByUsername(username);
    }

    @Override
    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
