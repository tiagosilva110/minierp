package io.github.tiagosilva110.mini_erp.controller.dto.mapper;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toEntity(PersonDTO dto);

    PersonDTO toDTO(Person person);

}
