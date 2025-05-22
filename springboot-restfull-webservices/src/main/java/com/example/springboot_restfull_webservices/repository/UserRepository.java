package com.example.springboot_restfull_webservices.repository;
import com.example.springboot_restfull_webservices.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
