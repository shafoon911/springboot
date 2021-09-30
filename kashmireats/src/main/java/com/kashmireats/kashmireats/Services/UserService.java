package com.kashmireats.kashmireats.Services;

import com.kashmireats.kashmireats.Models.User;

public interface UserService {
    public User registerUser(User user);
    public User loginUser(User user);
}
