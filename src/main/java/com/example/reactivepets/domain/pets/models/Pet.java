package com.example.reactivepets.domain.pets.models;

import com.example.reactivepets.domain.owners.models.Owner;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {
    private Integer id;

    private Integer age;

    private String name;

    private Owner owner;
}
