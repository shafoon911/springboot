package com.kashmireats.kashmireats.Controllers;

import com.kashmireats.kashmireats.Models.Contact;
import com.kashmireats.kashmireats.Services.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.security.Principal;
import java.util.List;

@RestController
@Api(tags = "Contact")
public class ContactsController {
    @Autowired
    ContactService contactService;

    @ApiOperation(value = "Show all contacts")
    @GetMapping("/contacts")
    public List<Contact> getAllContacts(@ApiIgnore  Principal principal){
        return contactService.getAllContacts(principal.getName());
    }
    @ApiOperation(value = "Add Contacts")
    @PostMapping("/addContact")
    public ResponseEntity<?> addContact(@RequestBody Contact contact){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        try{
            contact.setUsername(auth.getName());
                contactService.addContact(contact);
        }
        catch (Exception e){

        }
        return ResponseEntity.ok(contact);
    }


}
