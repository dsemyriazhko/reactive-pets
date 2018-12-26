package com.example.reactivepets.domain.pets.models;

import org.springframework.data.relational.core.mapping.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {
    @Column("pet_id")
    private Integer id;

    @Column("age")
    private Integer age;

    @Column("name")
    private String name;

    @Column("owner_id")
    private Integer ownerId;
}
