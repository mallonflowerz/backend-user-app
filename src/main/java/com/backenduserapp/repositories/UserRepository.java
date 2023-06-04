package com.backenduserapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backenduserapp.models.entities.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByUsername(String username);
}
