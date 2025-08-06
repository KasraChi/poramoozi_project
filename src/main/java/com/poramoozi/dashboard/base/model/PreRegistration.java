package com.poramoozi.dashboard.base.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PreRegistration {

    @Id
    private Long id;
    private String title;
    private String level;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;




}
