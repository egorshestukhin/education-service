package com.alpharesource.entity;

import com.alpharesource.enums.QuestionType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
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
    String description;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    QuestionType type;

    @NotNull
    Boolean active;

    Integer order;

    @ManyToOne
    @JoinTable(name = "TestEntity")
    TestEntity testEntity;
}
