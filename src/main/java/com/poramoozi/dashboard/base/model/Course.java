package com.poramoozi.dashboard.base.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Course {

    @Id
    private Long id;
    private String title;
    private String level;
    private LocalDate startDate;
    private LocalDate endDate;

@ManyToOne
    private Company company;

}
