package com.example.sesion15.entities;

import com.example.sesion15.repositories.AuthorityRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity(name="authorities")
public class Authority {

    public Authority(AuthorityName authorityName){
        this.name = authorityName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AuthorityName name;

}
