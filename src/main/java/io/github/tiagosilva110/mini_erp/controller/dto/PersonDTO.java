package io.github.tiagosilva110.mini_erp.controller.dto;

import jakarta.validation.constraints.*;

import java.util.UUID;

public record PersonDTO(
        Boolean isPerson,
        @Size(min = 11, max = 14, message = "Field out of size range")
        String cpfCnpj,
        @NotBlank(message = "Required field")
        @Size(min = 2, max = 60, message = "Field out of size range")
        String name,
        @Size(max = 60, message = "Field out of size range")
        String fantasyName,
        Integer department,
        @Size(max = 11, message = "Field out of size range")
        String phone,
        @Size(max = 60, message = "Field out of size range")
        String email,
        @Size(max = 30, message = "Field out of size range")
        String district,
        @Size(max = 30, message = "Field out of size range")
        String city,
        @Size(max = 30, message = "Field out of size range")
        String country,
        @Size(min = 8, max = 8, message = "Field out of size range")
        String cep,
        @Size(max = 60, message = "Field out of size range")
        String adress,
        @Size(max = 30, message = "Field out of size range")
        String complement,
        @Size(max = 20, message = "Field out of size range")
        String stateReg,
        Boolean isSuply,
        Boolean isClient,
        Boolean isEmployee,
        UUID enterprise
) {

}
