package io.github.tiagosilva110.mini_erp.controller.dto;

import java.util.UUID;

public record PersonUpdateDTO(
        String name,
        String fantasyName,

        Boolean isSuply,
        Boolean isClient,
        Boolean isEmployee,

        ContactUpdateDTO contact,
        AddressUpdateDTO address,
        UUID departmentId
) {
}
