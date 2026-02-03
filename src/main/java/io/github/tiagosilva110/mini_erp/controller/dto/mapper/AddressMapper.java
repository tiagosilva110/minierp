package io.github.tiagosilva110.mini_erp.controller.dto.mapper;
import io.github.tiagosilva110.mini_erp.controller.dto.AddressCreateDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.AddressDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.AddressUpdateDTO;
import io.github.tiagosilva110.mini_erp.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toEntity(AddressCreateDTO dto);

    AddressDTO toDTO(Address entity);

    void updateEntity(AddressUpdateDTO dto, @MappingTarget Address entity);
}
