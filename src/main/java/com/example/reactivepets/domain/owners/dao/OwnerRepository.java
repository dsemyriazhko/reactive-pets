package com.example.reactivepets.domain.owners.dao;

import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.stereotype.Repository;

import com.example.reactivepets.domain.owners.models.Owner;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Repository
public class OwnerRepository {
    private final DatabaseClient databaseClient;

    public Flux<Owner> findAll() {
        return databaseClient.select().from("owners").as(Owner.class).fetch().all();
    }
}
