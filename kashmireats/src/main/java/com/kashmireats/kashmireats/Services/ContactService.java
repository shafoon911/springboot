package com.kashmireats.kashmireats.Services;

import com.kashmireats.kashmireats.Models.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getAllContacts(String username);
    public  Contact addContact(Contact contact);
}
