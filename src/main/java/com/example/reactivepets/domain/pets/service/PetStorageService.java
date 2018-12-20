package com.example.reactivepets.domain.pets.service;

import org.springframework.stereotype.Service;

import com.example.reactivepets.domain.pets.dao.PetRepository;
import com.example.reactivepets.domain.pets.models.Pet;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class PetStorageService {
    private final PetRepository petRepository;

    public Flux<Pet> getAll() {
        return petRepository.findAll();
    }
}
