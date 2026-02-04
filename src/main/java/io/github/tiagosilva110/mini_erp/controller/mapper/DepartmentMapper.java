package io.github.tiagosilva110.mini_erp.controller.mapper;


import io.github.tiagosilva110.mini_erp.controller.dto.DepartmentDTO;
import io.github.tiagosilva110.mini_erp.model.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toEntity(DepartmentDTO dto);

    DepartmentDTO toDto(Department entity);

}
