package com.example.reactivepets.domain.owners.services;

import org.springframework.stereotype.Service;

import com.example.reactivepets.domain.owners.dao.OwnerRepository;
import com.example.reactivepets.domain.owners.models.Owner;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class OwnerStorageService {
    private final OwnerRepository repository;
    
    public Flux<Owner> getAll() {
        return repository.findAll();
    }
 }
