package com.alpharesource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "TestQuestionLines")
public class TestQuestionLine {

    @Id
    Integer id;

    @NotNull
    String description;

    Integer order;

    @ManyToOne
    @JoinTable(name = "TestQuestion")
    TestQuestion testEntity;
}
