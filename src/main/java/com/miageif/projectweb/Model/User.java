package com.miageif.projectweb.Model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(generator = "user_id_sequence")
    private Integer id;
    @Column(name = "username")
    private String username;

    public User(String username){
        this.setUsername(username);
    }
}
