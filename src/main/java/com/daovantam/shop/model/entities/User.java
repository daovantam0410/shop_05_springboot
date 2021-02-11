package com.daovantam.shop.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gía trị id được tạo ra sẽ autoincrement
    private Long id;

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false) // Khi insert gia tri phai co gia tri
    private String password;

    @Column
    private String address;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String phone;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "permission",
            joinColumns = @JoinColumn(name = "user_id",  nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false))
    private Set<Role> roles = new HashSet<>();
}
