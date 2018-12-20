package com.example.reactivepets.domain.pets.dao;


import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.stereotype.Repository;

import com.example.reactivepets.domain.pets.models.Pet;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Repository
public class PetRepository {
    private final DatabaseClient databaseClient;

    public Flux<Pet> findAll() {
        return databaseClient.select()
            .from("pets")
            .as(Pet.class)
            .fetch()
            .all();
    }
}
