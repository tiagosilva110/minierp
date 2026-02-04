package io.github.tiagosilva110.mini_erp.controller;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.controller.mapper.PersonMapper;
import io.github.tiagosilva110.mini_erp.model.Person;
import io.github.tiagosilva110.mini_erp.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;
    private final PersonMapper mapper;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody PersonDTO dto){

        Person person = mapper.toEntity(dto);

        Person created = service.create(person);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(created.getId());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        return ResponseEntity.ok(service.findById(uuid));
    }
}
