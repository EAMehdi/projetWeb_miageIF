package com.miageif.projectweb.Controller;

import com.miageif.projectweb.Model.User;
import com.miageif.projectweb.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserApi {
    private final UserRepository userRepository;

    @GetMapping("user/{username]")
    public Optional<User> findUserByUsername(@PathVariable String username){
        return userRepository.findByUsername(username);
    }

    @GetMapping("user/{id]")
    public Optional<User> findUserById(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @PutMapping("user/{username}")
    public Optional<User> save(@PathVariable String username){
        Optional<User> user= userRepository.findByUsername(username);
        user.ifPresent(value ->value.setUsername(username));
        return userRepository.save(user.orElse(null));
    }



}
