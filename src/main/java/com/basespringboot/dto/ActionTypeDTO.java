
package com.basespringboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionTypeDTO {

    private Integer id;

    private String code;

    private String name;

    private Boolean longAction;

    private Integer hungerDelta;

    private Integer thirstDelta;

    private Integer sleepDelta;

    private Integer mentalHealthDelta;

    private Integer moneyDelta;
}
