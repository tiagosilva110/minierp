package io.github.tiagosilva110.mini_erp.controller.dto.mapper;

import io.github.tiagosilva110.mini_erp.controller.dto.ContactCreateDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.ContactDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.ContactUpdateDTO;
import io.github.tiagosilva110.mini_erp.model.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    Contact toEntity(ContactCreateDTO dto);

    ContactDTO toDTO(Contact entity);

    void updateEntity(ContactUpdateDTO dto, @MappingTarget Contact entity);
}
