package com.basespringboot.repository;

import com.basespringboot.entity.ActionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Data access layer. JpaRepository<Entity, IdType> already provides
 * findAll(), findById(), save(), deleteById(), existsById()...
 * Spring generates the implementation at runtime.
 */
@Repository
public interface ActionTypeRepository extends JpaRepository<ActionType, Integer> {

    // Derived queries: Spring builds the SQL from the method name
    Optional<ActionType> findByCode(String code);

    boolean existsByCode(String code);
}
