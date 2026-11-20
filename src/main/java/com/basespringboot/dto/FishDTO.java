
package com.basespringboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishDTO {

    private Long id;

    private String name;

    private int hunger;

    private int thirst;

    private int sleep;

    private int mentalHealth;

    private int money;

    private int currentDay;

    private boolean alive;

    private boolean died;
}
