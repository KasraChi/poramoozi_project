package com.poramoozi.dashboard.base.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Company {

    @Id
    private Long id;
    private String name;
    private String branch;
    private String address;
    private String email;
    private String phone;



}
