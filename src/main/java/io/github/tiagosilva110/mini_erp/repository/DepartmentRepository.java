package io.github.tiagosilva110.mini_erp.repository;

import io.github.tiagosilva110.mini_erp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<Department, UUID> {
}
