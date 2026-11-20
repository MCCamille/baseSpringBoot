package com.basespringboot.service;

import com.basespringboot.dto.ActionTypeDTO;

import java.util.List;

/**
 * Service contract for ActionType: WHAT to do (the HOW lives in the implementation).
 * Works only with DTOs, never exposes the entity.
 */
public interface ActionTypeService {

    // Returns all action types
    List<ActionTypeDTO> findAll();

    // Returns one action type, throws an exception if the id does not exist
    ActionTypeDTO findById(Integer id);

    // Creates a new action type (the id in the DTO is ignored, the database generates it)
    ActionTypeDTO create(ActionTypeDTO actionTypeDTO);

    // Updates an existing action type identified by its id
    ActionTypeDTO update(Integer id, ActionTypeDTO actionTypeDTO);

    // Deletes an action type, throws an exception if the id does not exist
    void delete(Integer id);
}
