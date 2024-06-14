package com.example.sesion15.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public User(String username, String password, List<Authority> authorities){
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name="user_authority",
                joinColumns =@JoinColumn(name="user_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id")
    )
    private List<Authority> authorities;
}
