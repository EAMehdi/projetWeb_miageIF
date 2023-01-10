package com.miageif.projectweb.Controller;

import com.miageif.projectweb.Model.User;
import com.miageif.projectweb.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class UserApi {
    @Autowired
    private final UserRepository userRepository;

    @GetMapping("user/{username}")
    public Optional<User> findUserByUsername(@PathVariable String username){
        return userRepository.findByUsername(username);
    }

    @GetMapping("users/")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("user/{id}")
    public Optional<User> findUserById(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @PostMapping("user/")
    public User save(@RequestBody User user){
        return userRepository.save(user);

    }
    @PostMapping("user/{username}")
    public User saveUsername(@PathVariable String username){
        Optional<User> optionalUser=userRepository.findByUsername(username);
        return userRepository.save(optionalUser.orElse(new User(username)));

    }









}
