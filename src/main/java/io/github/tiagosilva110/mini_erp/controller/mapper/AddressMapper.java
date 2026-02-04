package io.github.tiagosilva110.mini_erp.controller.mapper;
import io.github.tiagosilva110.mini_erp.controller.dto.AddressDTO;
import io.github.tiagosilva110.mini_erp.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toEntity(AddressDTO dto);

    AddressDTO toDTO(Address entity);

}
