package io.github.tiagosilva110.mini_erp.repository;

import io.github.tiagosilva110.mini_erp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
