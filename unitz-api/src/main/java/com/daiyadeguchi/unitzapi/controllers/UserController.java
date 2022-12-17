package com.daiyadeguchi.unitzapi.controllers;

import com.daiyadeguchi.unitzapi.model.User;
import com.daiyadeguchi.unitzapi.repository.UserRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users")
    List<User> all() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    User findUser(@PathVariable Long id) throws Exception {
        return userRepository.findById(id)
                .orElseThrow(() -> new Exception("No user found with the id: " + id));
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

}
