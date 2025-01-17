package com.swadsutra.dilliKitchen.services.serviceImpl;

import com.swadsutra.dilliKitchen.Repository.UserRepository;
import com.swadsutra.dilliKitchen.dtos.LoginRequest;
import com.swadsutra.dilliKitchen.dtos.LoginResponse;
import com.swadsutra.dilliKitchen.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }
}
