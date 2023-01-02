package com.miageif.projectweb.Repository;

import com.miageif.projectweb.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    public Optional<User> findById(Integer u);
    public Optional<User> findByUsername(String username);
    public Optional<User> save(User u);
    public void deleteById(Integer id);
}
