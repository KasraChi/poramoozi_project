package com.poramoozi.dashboard.base.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
public class MyUser {
    @Id
    private Long id;
    private String username;
    private String password;
    private String role;
    private String fullName;
    private boolean enabled;




}
