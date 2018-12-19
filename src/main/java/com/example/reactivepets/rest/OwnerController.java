package com.example.reactivepets.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reactivepets.domain.owners.models.Owner;
import com.example.reactivepets.domain.owners.services.OwnerStorageService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/owners", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
public class OwnerController {
    private final OwnerStorageService ownerStorageService;

    //todo: return DTO
    @GetMapping()
    public Flux<Owner> getOwners() {
        return ownerStorageService.getAll();
    }
}
