package com.swadsutra.dilliKitchen.services;

import com.swadsutra.dilliKitchen.dtos.LoginRequest;
import com.swadsutra.dilliKitchen.dtos.LoginResponse;

public interface AuthService {

    LoginResponse login(LoginRequest loginRequest);
}
