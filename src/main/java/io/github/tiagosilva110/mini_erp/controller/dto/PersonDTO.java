package io.github.tiagosilva110.mini_erp.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record PersonDTO(
        UUID id,
        String cpfCnpj,
        String name,
        String fantasyName,

        Boolean isPerson,
        Boolean isSupply,
        Boolean isClient,
        Boolean isEmployee,

        ContactDTO contact,
        AddressDTO address,
        DepartmentDTO department,

        UUID enterprise
) {

}
