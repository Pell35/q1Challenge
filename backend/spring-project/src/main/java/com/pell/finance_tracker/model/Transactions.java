package com.pell.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;
    private double amount;
    private String description;
    private LocalDate date;

    //ToDo: Add Getters and Setters
}