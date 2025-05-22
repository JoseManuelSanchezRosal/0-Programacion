package com.example.springboot_restfull_webservices.service;
import com.example.springboot_restfull_webservices.modelo.User;
import com.example.springboot_restfull_webservices.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }
    @Override
    public User getUserById(Long userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public User updateUser(User user){
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if(optionalUser.isPresent()){
            User existingUser = userRepository.findById(user.getId()).get();
            existingUser.setNombre(user.getNombre());
            existingUser.setApellido(user.getApellido());
            existingUser.setEmail(user.getEmail());
            User updateUser = userRepository.save(existingUser);
            return updateUser;
        }else{
            throw new EntityNotFoundException("Usuario "+ user.getId()+" no encontrado");
        }
    }
    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}











