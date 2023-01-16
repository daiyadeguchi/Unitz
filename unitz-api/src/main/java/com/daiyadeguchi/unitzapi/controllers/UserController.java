package com.daiyadeguchi.unitzapi.controllers;

import com.daiyadeguchi.unitzapi.model.User;
import com.daiyadeguchi.unitzapi.repository.UserRepository;
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
        System.out.println(newUser);
        return userRepository.save(newUser);
    }

    @PutMapping("/users/{id}")
    User editUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setAdminFlg(newUser.getAdminFlg());
                    user.setMajor(newUser.getMajor());
                    user.setPhoneNo(newUser.getPhoneNo());
                    user.setEmergencyPhoneNo(newUser.getEmergencyPhoneNo());
                    user.setTotalUnits(newUser.getTotalUnits());
                    user.setRemainingUnits(newUser.getRemainingUnits());
                    user.setCoursesId(newUser.getCoursesId());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
