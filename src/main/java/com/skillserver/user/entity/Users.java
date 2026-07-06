package com.skillserver.user.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String lastname;

    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique=true)
    private String  phoneno;
    private Role role;

}
