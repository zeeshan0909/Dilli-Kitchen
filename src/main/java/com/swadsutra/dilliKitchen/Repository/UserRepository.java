package com.swadsutra.dilliKitchen.Repository;

import com.swadsutra.dilliKitchen.dtos.LoginRequest;
import com.swadsutra.dilliKitchen.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> FindByEmail(LoginRequest loginRequest);
}
