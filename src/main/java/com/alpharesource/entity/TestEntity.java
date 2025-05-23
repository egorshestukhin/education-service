package com.alpharesource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * Represents a Test root object
 */
@Data
@Entity
@Table(name = "TestEntity")
public class TestEntity {

    @Id
    Integer id;

    @NotNull
    String name;

    @NotNull
    String description;

    Integer passingScore;

    /**
     * In Seconds
     */
    Integer timeLimit;

    @NotNull
    Boolean active;

    @NotNull
    Integer version;
}
