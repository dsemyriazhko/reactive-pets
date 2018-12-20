package com.example.reactivepets.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.reactivepets.domain.pets.models.Pet;
import com.example.reactivepets.domain.pets.service.PetStorageService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RequestMapping("/pets")
@Controller
public class PetController {
    private final PetStorageService petStorageService;

    @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    @ResponseBody
    public Flux<Pet> getPets() {
        return petStorageService.getAll();
    }
}
