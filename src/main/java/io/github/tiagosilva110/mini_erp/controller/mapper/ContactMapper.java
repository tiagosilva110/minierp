package io.github.tiagosilva110.mini_erp.controller.mapper;

import io.github.tiagosilva110.mini_erp.controller.dto.ContactDTO;
import io.github.tiagosilva110.mini_erp.model.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    Contact toEntity(ContactDTO dto);

    ContactDTO toDTO(Contact entity);

}
