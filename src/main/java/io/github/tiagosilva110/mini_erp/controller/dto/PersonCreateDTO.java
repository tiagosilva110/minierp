package io.github.tiagosilva110.mini_erp.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record PersonCreateDTO(
        @NotBlank(message = "Required field")
        @Size(min = 11, max = 14, message = "Field out of size range")
        String cpfCnpj,
        @NotBlank(message = "Required field")
        @Size(min = 2, max = 60, message = "Field out of size range")
        String name,
        @Size(max = 60, message = "Field out of size range")
        String fantasyName,

        Boolean isPerson,
        Boolean isSuply,
        Boolean isClient,
        Boolean isEmployee,

        ContactCreateDTO contact,
        AddressCreateDTO address,
        UUID department
) {

}
