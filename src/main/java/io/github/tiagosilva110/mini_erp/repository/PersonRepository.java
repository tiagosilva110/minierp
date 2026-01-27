package io.github.tiagosilva110.mini_erp.repository;

import io.github.tiagosilva110.mini_erp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
