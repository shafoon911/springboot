package com.kashmireats.kashmireats.Repository;

import com.kashmireats.kashmireats.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //username , it will return the user of given username
    public User findByUsername(String username);
}
