package com.kashmireats.kashmireats.Repository;

import com.kashmireats.kashmireats.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

    @Query("Select c from Contact c where c.username =:username")
    public List<Contact> getAllContactsByUsername(@Param("username") String username);
}
