package com.alpharesource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

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

    @NotNull
    Boolean active;
}
