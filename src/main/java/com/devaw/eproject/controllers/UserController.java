package com.devaw.eproject.controllers;

import com.devaw.eproject.models.User;
import com.devaw.eproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository usrRepository;
    @GetMapping(value = "users")
    public List<User> getUsers () {
        return usrRepository.findAll();
    }

    @GetMapping(value = "users/{name}")
    public List<User> getUser (@PathVariable("name") String name) {
        return usrRepository.findByName(name);
    }

    /*@GetMapping(value = "user/{id}")
    public User getUserById (@PathVariable("id") Long id) {
        return usrRepository.findById(id);
    }*/

    @PostMapping(value = "user")
    public User createUser (@RequestBody User user) {
        return usrRepository.save(user);
    }
    @PutMapping(value = "user/{id}")
    public User updateUser (@PathVariable("id") Long id, @RequestBody User user) {
        return usrRepository.save(user);
    }

    @DeleteMapping(value = "user/{id}")
    public void deleteUser (@PathVariable("id") Long id) {
        usrRepository.deleteById(id);
    }
}
