package io.github.tiagosilva110.mini_erp.controller;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonCreateDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
    public ResponseEntity<PersonDTO> create(@RequestBody PersonCreateDTO dto){

        PersonDTO created = service.create(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> findById(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        return ResponseEntity.ok(service.findById(uuid));
    }
}
