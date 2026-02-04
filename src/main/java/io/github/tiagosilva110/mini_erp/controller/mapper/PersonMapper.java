package io.github.tiagosilva110.mini_erp.controller.mapper;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
        componentModel = "spring",
        uses = { ContactMapper.class, AddressMapper.class }
)
public interface PersonMapper {

    Person toEntity(PersonDTO dto);

    PersonDTO toDTO(Person entity);

}
