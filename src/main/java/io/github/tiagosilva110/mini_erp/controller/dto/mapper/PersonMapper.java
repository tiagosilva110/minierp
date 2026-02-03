package io.github.tiagosilva110.mini_erp.controller.dto.mapper;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonCreateDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.PersonSimpleDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.PersonUpdateDTO;
import io.github.tiagosilva110.mini_erp.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        componentModel = "spring",
        uses = { ContactMapper.class, AddressMapper.class }
)
public interface PersonMapper {

    // ---------- CREATE ----------
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "department", ignore = true)
    Person toEntity(PersonCreateDTO dto);

    // ---------- READ ----------
    PersonDTO toDTO(Person person);

    PersonSimpleDTO toSimpleDTO(Person person);

    List<PersonSimpleDTO> toSimpleDTOList(List<Person> persons);

    // ---------- UPDATE ----------
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "cpfCnpj", ignore = true)
    @Mapping(target = "contact", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "department", ignore = true)
    void updateEntity(PersonUpdateDTO dto, @MappingTarget Person entity);

}
