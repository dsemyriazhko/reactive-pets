package com.example.reactivepets.domain.owners.models;

import org.springframework.data.relational.core.mapping.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner {
    @Column("owner_id")
    private Integer id;

    @Column("name")
    private String name;
}
