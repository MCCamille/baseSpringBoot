package com.basespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JPA entity mapped to the "action_types" table.
 * Each field matches a column.
 */
@Entity
@Table(name = "action_types")
@Getter
@Setter
@NoArgsConstructor // JPA requires a no-args constructor
public class ActionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL -> auto-increment handled by PostgreSQL
    private Integer id;

    @Column(name = "code", length = 30, nullable = false, unique = true)
    private String code;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    // Long action (max 2 per day) or not
    @Column(name = "long_action", nullable = false)
    private Boolean longAction;

    @Column(name = "hunger_delta", nullable = false)
    private Integer hungerDelta = 0;

    @Column(name = "thirst_delta", nullable = false)
    private Integer thirstDelta = 0;

    @Column(name = "sleep_delta", nullable = false)
    private Integer sleepDelta = 0;

    @Column(name = "mental_health_delta", nullable = false)
    private Integer mentalHealthDelta = 0;

    // Negative value = cost
    @Column(name = "money_delta", nullable = false)
    private Integer moneyDelta = 0;
}

