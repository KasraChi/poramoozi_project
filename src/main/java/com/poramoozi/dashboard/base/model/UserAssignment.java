package com.poramoozi.dashboard.base.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class UserAssignment {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private MyUser user;

    @ManyToOne
    private Assignment assignment;

    private LocalDate assignedDate;
    private int timeSpentInMinutes;
    private String status;
}
