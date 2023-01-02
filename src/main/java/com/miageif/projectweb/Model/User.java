package com.miageif.projectweb.Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "username")
    private String username;
}
