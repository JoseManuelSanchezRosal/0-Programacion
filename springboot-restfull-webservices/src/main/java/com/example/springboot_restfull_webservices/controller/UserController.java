package com.example.springboot_restfull_webservices.controller;
import com.example.springboot_restfull_webservices.modelo.User;
import com.example.springboot_restfull_webservices.service.UserService;
import lombok.AllArgsConstructor;
import org.hibernate.internal.build.AllowNonPortable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    // CREAR USUARIO
    @PostMapping("api/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    // GET ALL USERS:
    @GetMapping("api/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
    // UPDATE USER BY ID
    @PutMapping("api/users/{id}")
    // http:localhost:8080/api/users/1
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user){
        user.setId(userId);
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
    // DELETE USER BY ID:
    @DeleteMapping("api/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable ("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("Usuario eliminado correctamente", HttpStatus.OK);
    }
}