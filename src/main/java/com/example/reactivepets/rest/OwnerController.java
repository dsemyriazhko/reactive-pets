package com.example.reactivepets.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.reactivepets.domain.owners.models.Owner;
import com.example.reactivepets.domain.owners.services.OwnerStorageService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/owners")
public class OwnerController {
    private final OwnerStorageService ownerStorageService;

    @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    @ResponseBody
    public Flux<Owner> getOwners() {
        return ownerStorageService.getAll();
    }

    @GetMapping(value = "/test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Mono<String> getTest() {
        return Mono.just("my mono");
    }

    @GetMapping(value = "/text", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String getText() {
        return "my text";
    }
}
