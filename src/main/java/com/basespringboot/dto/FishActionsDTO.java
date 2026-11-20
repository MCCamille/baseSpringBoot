
package com.basespringboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishActionsDTO {

    private Long id;

    private Long fishId;

    private Integer dayNumber;

    private ActionTypeDTO actionType;
}
