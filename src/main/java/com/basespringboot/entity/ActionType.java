package com.basespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entité JPA = miroir Java de la table SQL "action_types".
 * Chaque champ correspond à une colonne.
 */
@Entity
@Table(name = "action_types")
public class ActionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL -> auto-incrément géré par PostgreSQL
    private Integer id;

    @Column(name = "code", length = 30, nullable = false, unique = true)
    private String code;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

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

    @Column(name = "money_delta", nullable = false)
    private Integer moneyDelta = 0; // négatif = coût

    // Constructeur vide OBLIGATOIRE pour JPA
    public ActionType() {
    }

    // --- Getters / Setters ---

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Boolean getLongAction() { return longAction; }
    public void setLongAction(Boolean longAction) { this.longAction = longAction; }

    public Integer getHungerDelta() { return hungerDelta; }
    public void setHungerDelta(Integer hungerDelta) { this.hungerDelta = hungerDelta; }

    public Integer getThirstDelta() { return thirstDelta; }
    public void setThirstDelta(Integer thirstDelta) { this.thirstDelta = thirstDelta; }

    public Integer getSleepDelta() { return sleepDelta; }
    public void setSleepDelta(Integer sleepDelta) { this.sleepDelta = sleepDelta; }

    public Integer getMentalHealthDelta() { return mentalHealthDelta; }
    public void setMentalHealthDelta(Integer mentalHealthDelta) { this.mentalHealthDelta = mentalHealthDelta; }

    public Integer getMoneyDelta() { return moneyDelta; }
    public void setMoneyDelta(Integer moneyDelta) { this.moneyDelta = moneyDelta; }
}

