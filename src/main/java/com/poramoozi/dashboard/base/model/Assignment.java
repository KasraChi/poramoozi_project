package com.poramoozi.dashboard.base.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Setter
@Getter
public class Assignment {

    @Id
    private Long id;


    @ManyToMany
    private List<User> AssignedTo;

    @ManyToOne
    private َAssignment task;




}
