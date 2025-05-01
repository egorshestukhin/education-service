package com.alpharesource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "TestQuestion")
public class TestQuestion {

    @Id
    Integer id;

    @NotNull
    String name;

    @NotNull
    String description;

    String type;

    @NotNull
    Boolean active;

    @JoinTable(name = "TestEntity")
    TestEntity testEntity;
}
