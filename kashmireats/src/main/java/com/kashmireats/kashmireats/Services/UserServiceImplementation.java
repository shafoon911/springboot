package com.kashmireats.kashmireats.Services;

import com.kashmireats.kashmireats.Models.User;
import com.kashmireats.kashmireats.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(User user) {

       return  userRepository.save(user);

    }

    @Override
    public User loginUser(User user) {
        return null;
    }
}
