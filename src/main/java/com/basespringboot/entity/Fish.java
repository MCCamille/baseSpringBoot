package com.basespringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fish")
@Getter
@Setter
public class Fish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    private int hunger = 100;

    private int thirst = 100;

    private int sleep = 100;

    @Column(name = "mental_health")
    private int mentalHealth = 100;

    private int money = 0;

    @Column(name = "current_day")
    private int currentDay = 1;

    private boolean alive = true;

    private boolean died = false;

}